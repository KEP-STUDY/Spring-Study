## Component Scan 실질적으로 처리하는 클래스와 메소드

스프링은 `@ComponentScan` 애노테이션이 부착된 클래스를 기준으로 하여 하위 패키지들의 빈을 등록한다.

그러면 과연 `@ComponentScan` 애노테이션은 스프링이 어떻게 이 애노테이션을 처리하는 걸까?

## ConfigurationClassParser

```java
class ConfigurationClassParser {
    ...
    ...
	private final ComponentScanAnnotationParser componentScanParser;
    ...
    ...

	@Nullable
	protected final SourceClass doProcessConfigurationClass(
			ConfigurationClass configClass, SourceClass sourceClass, Predicate<String> filter)
			throws IOException {

        ...
        ...

		// Process any @ComponentScan annotations
		Set<AnnotationAttributes> componentScans = AnnotationConfigUtils.attributesForRepeatable(
				sourceClass.getMetadata(), ComponentScans.class, ComponentScan.class);
		if (!componentScans.isEmpty() &&
				!this.conditionEvaluator.shouldSkip(sourceClass.getMetadata(), ConfigurationPhase.REGISTER_BEAN)) {
			for (AnnotationAttributes componentScan : componentScans) {
				// The config class is annotated with @ComponentScan -> perform the scan immediately
				Set<BeanDefinitionHolder> scannedBeanDefinitions =
						this.componentScanParser.parse(componentScan, sourceClass.getMetadata().getClassName()); // componentScanParser를 인스턴스로 갖고 있음 여기서 @ComponentScan 처리!
				// Check the set of scanned definitions for any further config classes and parse recursively if needed
				for (BeanDefinitionHolder holder : scannedBeanDefinitions) {
					BeanDefinition bdCand = holder.getBeanDefinition().getOriginatingBeanDefinition();
					if (bdCand == null) {
						bdCand = holder.getBeanDefinition();
					}
					if (ConfigurationClassUtils.checkConfigurationClassCandidate(bdCand, this.metadataReaderFactory)) {
						parse(bdCand.getBeanClassName(), holder.getBeanName());
					}
				}
			}
		}
        ...
        ...
	}
    ...
    ...
}
```

## ComponentScanAnnotationParser 클래스

```java
class ComponentScanAnnotationParser {
    ...
    ...

	public Set<BeanDefinitionHolder> parse(AnnotationAttributes componentScan, final String declaringClass) {
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(this.registry,
				componentScan.getBoolean("useDefaultFilters"), this.environment, this.resourceLoader);

		...
        // @ComponentScan에 설정된 옵션들(excludeFilters, scopeProxy, nameGenerator 등)을 읽어 처리할 수 있게
        // ClassPathBeanDefinitionScanner의 인스턴스 scanner에 설정하는 코드가 있음 생략
        ...

		Set<String> basePackages = new LinkedHashSet<>();
		String[] basePackagesArray = componentScan.getStringArray("basePackages");
		for (String pkg : basePackagesArray) {
			String[] tokenized = StringUtils.tokenizeToStringArray(this.environment.resolvePlaceholders(pkg),
					ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS);
			Collections.addAll(basePackages, tokenized);
		}
		for (Class<?> clazz : componentScan.getClassArray("basePackageClasses")) {
			basePackages.add(ClassUtils.getPackageName(clazz));
		}
		if (basePackages.isEmpty()) {
			basePackages.add(ClassUtils.getPackageName(declaringClass));
		}

        // 얘 아래쪽으로 내려왔넹 원래 위에 있었던 것 같은데...

		scanner.addExcludeFilter(new AbstractTypeHierarchyTraversingFilter(false, false) {
			@Override
			protected boolean matchClassName(String className) {
				return declaringClass.equals(className);
			}
		});

		return scanner.doScan(StringUtils.toStringArray(basePackages)); // 실질적인 scan이 수행되는 메소
	}
    ...
    ...
}

```

## ClassPathBeanDefinitionScanner 클래스

```java
public class ClassPathBeanDefinitionScanner extends ClassPathScanningCandidateComponentProvider {
	
    ...
    ...
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		Assert.notEmpty(basePackages, "At least one base package must be specified");
		Set<BeanDefinitionHolder> beanDefinitions = new LinkedHashSet<>();
		for (String basePackage : basePackages) {
			Set<BeanDefinition> candidates = findCandidateComponents(basePackage); // 여기서 특정 패키지에 속한 모든 리소스 파일들을 읽어온다.
			for (BeanDefinition candidate : candidates) {
				ScopeMetadata scopeMetadata = this.scopeMetadataResolver.resolveScopeMetadata(candidate);
				candidate.setScope(scopeMetadata.getScopeName());
				String beanName = this.beanNameGenerator.generateBeanName(candidate, this.registry);
				if (candidate instanceof AbstractBeanDefinition) {
					postProcessBeanDefinition((AbstractBeanDefinition) candidate, beanName);
				}
				if (candidate instanceof AnnotatedBeanDefinition) {
					AnnotationConfigUtils.processCommonDefinitionAnnotations((AnnotatedBeanDefinition) candidate);
				}
				if (checkCandidate(beanName, candidate)) {
					BeanDefinitionHolder definitionHolder = new BeanDefinitionHolder(candidate, beanName);
					definitionHolder =
							AnnotationConfigUtils.applyScopedProxyMode(scopeMetadata, definitionHolder, this.registry);
					beanDefinitions.add(definitionHolder);
					registerBeanDefinition(definitionHolder, this.registry);
				}
			}
		}
		return beanDefinitions;
	}
    ...
    ...
}
```

## ClassPathScanningCandidateComponentProvider

```java
public class ClassPathScanningCandidateComponentProvider implements EnvironmentCapable, ResourceLoaderAware {
    @Nullable
    private CandidateComponentsIndex componentsIndex;
    ...
    ...
    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
		if (this.componentsIndex != null && indexSupportsIncludeFilters()) {
			return addCandidateComponentsFromIndex(this.componentsIndex, basePackage);
		}
		else {
			return scanCandidateComponents(basePackage);
		}
	}
    ...
    ...
}
```

findCandidateComponents 메소드를 잘보면 조건이 있는 것을 볼 수 있다.

이 componentIndex 변수는 CandidateComponentsIndex 클래스 타입인데 재밌는 것이 `@Nullable` 메소드를 갖고 있다.

즉 이 값은 널이 될 수 있음을 암시하고 있다는 것에서 대략 이 멤버변수가 아마도 어떤 메타 데이터가 있을 때 채워지는 변수라고 볼 수 있겠다.

## CandidateComponentsIndex

```java
/**
 * Provide access to the candidates that are defined in {@code META-INF/spring.components}.
 *
 * <p>An arbitrary number of stereotypes can be registered (and queried) on the index: a
 * typical example is the fully qualified name of an annotation that flags the class for
 * a certain use case. The following call returns all the {@code @Component}
 * <b>candidate</b> types for the {@code com.example} package (and its sub-packages):
 * <pre class="code">
 * Set&lt;String&gt; candidates = index.getCandidateTypes(
 *         "com.example", "org.springframework.stereotype.Component");
 * </pre>
 *
 * <p>The {@code type} is usually the fully qualified name of a class, though this is
 * not a rule. Similarly, the {@code stereotype} is usually the fully qualified name of
 * a target type but it can be any marker really.
 *
 * @author Stephane Nicoll
 * @since 5.0
 */
public class CandidateComponentsIndex {
    ...
    생략
}
```

위의 주석 최 상단을 보면 spring.components에 정의된 후보들에 대한 접근을 제공하는 클래스인 것을 알 수 있다.

그 말은 즉슨, 이 파일에 클래스 패스를 명시할 수도 있다는 뜻이 된다.

그러나 500개 미만의 빈의 경우 클래스 패스를 스캐닝 하는 것과 파일을 읽어서 빈을 등록하는 것의 속도차이는 거의 없다고 한다.

<img width="1818" alt="스크린샷 2020-07-05 오전 12 44 26" src="https://user-images.githubusercontent.com/43809168/86516142-27f5ac00-be59-11ea-8111-6677a57d99b3.png">

직접 디버깅을 찍어보면 파일이 있는 경우 addCandidateComponentsFromIndex 메소드를 수행하는 것을 확인할 수 있다.

componentsIndex가 null이 아니게 되면서 이 기능을 수행하는 것을 확인할 수 있다.

이름만 보면 알겠지만 인덱스 파일로부터 빈을 등록하는 메소드이다.

그게 아니라면 일반적으로 클래스 패스(@ComponentScan이 위치한) 패키지 하위에 있는 클래스 중 `@Component` 애노테이션이 존재하는 클래스나

그 클래스를 메타 애노테이션으로 갖고 있는 애노테이션들을 조사해서 빈으로 등록하는 기능을 scanCandidateComponents 메소드가 수행한다.

이 기능은 스프링 5에 추가된 기능인데, 대규모 애플리케이션일 때 이 방법을 사용하면 스프링 애플리케이션이 구동될 때 조금 더 빠르게 시작할 수 있다는 장점이 있다. (단 빈이 500개 이상인 경우에만)

약간 샛길로 빠졌는데 다시 돌아와서 scanCandidateComponents 메소드와 addCandidateComponentsFromIndex 메소드에는 각각 isCandidateComponent 메소드가 존재한다.

```java
	protected boolean isCandidateComponent(MetadataReader metadataReader) throws IOException {
		for (TypeFilter tf : this.excludeFilters) {
			if (tf.match(metadataReader, getMetadataReaderFactory())) {
				return false;
			}
		}
		for (TypeFilter tf : this.includeFilters) {
			if (tf.match(metadataReader, getMetadataReaderFactory())) {
				return isConditionMatch(metadataReader);
			}
		}
		return false;
	}
```

이 isCandidateComponent 메소드는 `@Component` 애노테이션인 경우인지를 판별하는 함수이다.

여기서 `@Component` 애노테이션인 경우 필터를 통과해서 빈으로 등록되게 된다.

빈 등록 과정은 다음과 같다.

```java
	public ScannedGenericBeanDefinition(MetadataReader metadataReader) {
		Assert.notNull(metadataReader, "MetadataReader must not be null");
		this.metadata = metadataReader.getAnnotationMetadata();
		setBeanClassName(this.metadata.getClassName());
		setResource(metadataReader.getResource());
	}
```

`ScannedGenericBeanDefinition` 클래스의 생성자에서 빈의 이름을 등록한다.

이렇게 생성된 빈 후보들을 LinkedHashSet에 담아서 doScan 메소드로 반환한다.

그 이후 빈의 Scope이 싱글톤인지 프로토타입인지 판별하고 definitionHolder로 만든 뒤 beanDefinitions로 만들고 이를

registerBeanDefinition 메소드를 통해 registry에 등록하게 한다.

이 때 registry는 최초에 매개변수로 넘겨준 beanFactory로써 DefaultListableBeanFactory 클래스의 인스턴스이다.

때문에 아래의 과정에서 빈이 등록되게 되는 것이다.

```java
if (checkCandidate(beanName, candidate)) {
					BeanDefinitionHolder definitionHolder = new BeanDefinitionHolder(candidate, beanName);
					definitionHolder =
							AnnotationConfigUtils.applyScopedProxyMode(scopeMetadata, definitionHolder, this.registry);
					beanDefinitions.add(definitionHolder);
					registerBeanDefinition(definitionHolder, this.registry); // 여기서 빈팩토리에 빈이 등록
}
```

## 참조

https://thswave.github.io/spring/2015/02/02/spring-mvc-annotaion.html

https://github.com/awslabs/aws-serverless-java-container/issues/131

https://stackoverflow.com/questions/47254907/how-can-i-create-a-spring-5-component-index

