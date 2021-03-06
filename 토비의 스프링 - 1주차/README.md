# 1주차 1.1 ~ 1.3 발표자 : 해리

## What is Spring

스프링은 자바 엔터프라이즈 애플리케이션 개발에 사용되는 애플리케이션 프레임워크이다.

## 스프링 컨테이너

스프링은 스프링 컨테이너 또는 애플리케이션 컨텍스트라 불리는 스프링 런타임 엔진을 제공한다.

스프링 컨테이너는 설정정보를 참고로 해서 애플리케이션을 구성하는 객체를 생성하고 관리한다.

스프링 컨테이너는 독립적으로 동작할 수 있지만 보통은 웹 모듈에서 동작하는 서비스나 서블릿으로 등록해서 사용한다.

## IoC/DI, 서비스 추상화, AOP

- IoC/DI 의존성 관리를 위해 제공되는 스프링의 핵심

- 스프링을 사용하면 환경, 서버, 특정 기술에 종속되지 않고 이식성이 뛰어나고 유연한 애플리케이션을 만들 수 있다. (스프링의 철학인 비침투성)

- AOP는 애플리케이션 단에서 사용되는 반복적인 코드를 줄여주고 깔끔한 코드를 유지할 수 있게 해주는 스프링의 또 다른 핵심 기술이다.

## 기술 API

스프링에는 엔터프라이즈 애플리케이션을 개발에 도움이 되는 다양한 영역의 방대한 기술 API를 제공한다.

비즈니스 서비스, 웹 프레젠테이션, 기반 서비스, 도메인 계층, 데이터 액세스 등의 기술들을 스프링에서 일관된 방식으로 사용할 수 있도록 지원해주는 기능과 전략 클래스 등을 제공한다.

스프링의 모든 기술은 표준 자바 엔터프라이즈 플랫폼 JavaEE에 기반을 두고 있다.

## 스프링은 어떻게 성공했을까?

- 스프링은 Node.js처럼 똑똑한 개발자가 혼자 뚝딱 개발한 것이 아님, 많은 개발자들이 오랜 시간에 걸쳐 자바를 통해 엔터프라이즈 시스템을 개발할 수 있도록 고민하고 노력한 결정체임.

- 대한민국 전자 정부 표준 프레임워크이기도 하다.

- 스프링은 사실상 자바 엔터프라이즈 표준 기술

- 어캐 성공 했노?
    - 스프링을 사용함으로써 자바와 엔터프라이즈 개발의 기본에 충실한 베스트 프랙티스 적용 가능
    - 이상적인 개발 철학과 프로그래밍 모델을 이해할 수 있음
    - 결과적으로 좋은 개발 습관을 체득

- 스프링의 강점 두 가지
  - 단순함
    - 스프링은 EJB라는 꼰대 표준 기술을 비판하며 등장
    - 문제를 해결하는데 있어 EJB는 불필요하게 복잡했고 스프링은 반대로 가장 단순하고 명쾌하게 접근함
    - 과거 자바는 이상적인 객체지향 언어로 찬양받았지만 자바 기술이 점점 더 복잡해지면서 그 특징을 잃어버리기 시작함
    - 스프링은 잃어버린 객체지향 언어의 장점을 다시 살리면서 가장 단순한 객체지향 개발 모델인 POJO 프로그래밍을 강력히 주장함
  - 유연성
    - 스프링은 다른 많은 프레임워크와 편리하게 접목될 수 있음
    - 스프링만큼 많은 서드파티 프레임워크의 지원을 받는 기술도 없을 정도
    - 스프링은 프레임워크를 위한 프레임워크이자 접착(glue) 프레임워크라고도 불리움
    - 스프링 개발 철학 중 하나는 **항상 프레임워크 기반의 접근 방법을 사용하라**
    - 스프링은 개발자들에게 스프링을 확장해 사용하도록 권장
    - 스프링은 지난 7년(책 기준) 단 한번도 코드 베이스를 흔들거나 새로 만드는 일 없이 기존 아키텍처와 설계, 코드를 유지하며 안정적으로 발전해왔음

## 스프링 학습과 활용의 어려움

스프링의 가치를 제대로 누리며 개발하기 위해서는 스프링을 **제대로** 공부해야한다.

다른 프레임워크도 마찬가지이지만 스프링은 특히 프레임워크가 지향하는 가치와 프로그래밍 모델을 충분히 이해하지 못하고는 제대로 활용하기가 어려움.

반면 한번 원리와 개발 사상을 이해하면 이후 새로운 기능이 아무리 많이 추가되더라도 빠르고 쉽게 학습할 수 있음.

우리는 다음의 세 가지를 주안점을 두고 스프링을 공부해야함.

1. 스프링의 핵심 가치와 원리에 대한 이해
    - 스프링에서 가장 중요한 핵심 가치와 그것이 가능하도록 도와주는 세 가지 핵심 기술을 이해해야함

2. 스프링의 기술에 대한 지식과 선택 기준 정립
    - 스프링의 기본 원리를 이해했으면 스프링이 어떻게 다양한 방법으로 확장하고 적용했는지 살펴봐야함.

3. 스프링의 적용과 확장
    - 스프링을 효과적으로 사용하기 위해서는 스프링을 기반으로 한 프레임워크를 만들어서 사용함.
    - 프레임워크를 만든다는 것이 스프링을 내부로 감춘다는 뜻이 아니라 스프링을 효과적으로 사용할 수 있도록 프레임워크 형태로 개발하여 이용할 수 있게 해주는 것을 의미함

## 저자의 조언

- 스프링은 러닝 커브가 완만한 기술이 아니다.

- 스프링을 학습하고 난 뒤에는 자신이 좀 **더 나은 개발자**가 되었는지 스스로 확인해보아야 한다.

- 코드가 깔끔한지, 객체지향 원칙에 충실했는지 등을 끊임없이 확인하고 검증하자

- 더 많은 테스트코드를 작성하고 있는지, 유연하고 확장하기 쉬운 애플리케이션을 만들고 있는지 스스로에게 물어보자

- 가급적이면 이 책을 공부할 때 예제도 같이 타이핑해보라

## 1부 : 이해

**오브젝트와 의존관계**

스프링이 자바에서 가장 중요하게 가치를 두는 점은 **객체지향 프로그래밍**이 가능한 언어라는 것이다.

그래서 스프링은 객체에 관심이 많다.

객체지향 설계의 기초와 원칙, 다양한 목적을 위해 재활용 가능한 설계 방법인 디자인 패턴, 더 깔끔한 구조가 되도록 지속적으로 개선해나가는 작업인 리팩토링, 객체가 기대한 대로 동작하고 있는지를 효과적으로 검증하는데 쓰이는 단위 테스트와 같이 객체 설계와 구현에 관한 여러가지 응용 기술과 지식이 요구된다.

## 뭘 해볼까?

사용자 정보를 JDBC API를 사용해 DB에 저장하고 조회할 수 있는 간단한 DAO를 하나 만들어보자.

```kotlin
class User(
        val id: Long,
        val name: String,
        val password:String
)
```

여기서 id는 PK가 될 것이다.

다음으로는 사용자의 정보를 DB로 부터 가져오고 넣기 위해 DAO 클래스를 만들어 볼 것이다.

간단하게 CRUD 기능을 하는 DAO 클래스를 만들어보도록 하겠다.

JDBC를 사용하는 작업은 일반적으로 다음과 같은 과정을 거친다.

1. DB 연결을 위한 Connection을 가져온다.

2. SQL을 담은 Statement(또는 PreparedStatement)를 만든다.

3. 만들어진 Statement를 실행한다.

4. 조회의 경우 SQL 쿼리의 실행 결과를 ResultSet으로 받아서 정보를 저장할 오브젝트에 옮겨준다.

5. 작업 중에 생성된 Connection, Statement, ResultSet 같은 리소스는 작업을 마친 후 반드시 닫아준다.

6. JDBC API가 만들어내는 예외를 잡아서 직접 처리하거나, 예외 발생시 throw를 통해 예외를 던져준다.

## 초난감 DAO 등장

```kotlin
class UserDao{
    init {
        Class.forName("org.h2.Driver")
        val connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")

        val prepareStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        prepareStatement.execute()
    }

    fun addUser(user:User) {
        Class.forName("org.h2.Driver")
        val connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")

        connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        val preparedStatement = connection.prepareStatement(
                "insert into user(id,name,password) values(?,?,?)"
        )
        preparedStatement.setLong(1, user.id)
        preparedStatement.setString(2, user.name)
        preparedStatement.setString(3, user.password)

        preparedStatement.execute()
        preparedStatement.close()
        connection.close()
    }

    fun getUser(id: Long): User {
        Class.forName("org.h2.Driver")
        val connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")

        val preparedStatement = connection.prepareStatement(
                "select * from user where id = ?"
        )
        preparedStatement.setLong(1, id)

        val resultSet = preparedStatement.executeQuery()
        resultSet.next()
        val user = User(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("password")
        )

        resultSet.close()
        preparedStatement.close()
        connection.close()

        return user

    }
}
```

위에서 언급한 작업을 수행하는 UserDAO이다.

얼핏 봐도 코드가 길고 복잡해보인다.

이 코드를 테스트할 수 있는 가장 좋은 방법은 테스트 코드를 짜는 것이다.

테스트 코드를 작성해보자.

```
class UserDaoTest {
    @Test
    fun crud() {
        // given
        val userDao = UserDao()
        val user = User(
                123,
                "harry",
                "code"
        )

        // when
        userDao.addUser(user)
        val findUser = userDao.getUser(user.id)

        // then
        assertEquals(user.name,findUser.name)
        assertEquals(user.password,findUser.password)
    }
}
```

참고로 테스트 코드의 중요성에 대해 잠깐 언급하자면,

백기선님의 경우 면접시에 구직자의 포트폴리오를 볼 때 테스트 코드가 없으면 거기서 부터 포트폴리오를 안보신다고 한다.

그러니 우리도 꼭 꼭 테스트 코드를 작성하도록 하자.

위는 BDD 스타일로 작성된 테스트코드이다.

위 테스트코드는 문제 없이 작동한다.

우리의 요구사항은 만족하였으나 앞서 작성한 Dao 클래스는 회사에서 짤리기 딱 좋은 코드이다.

우리의 요구 사항을 정상적으로 만족했고 동작도 문제없이 잘 되지만 이 클래스에는 심각한 문제들이 많이 숨어있다.

## DAO의 분리, 관심사의 분리

객체지향의 세계에서 모든 것은 변한다.

오브젝트에 대한 설계와 이를 구현한 코드는 계속해서 변한다.

`소프트웨어 개발에서 끝이라는 개념은 없다. by toby`

여기서 프로그래밍 기초 개념 중 중요한 개념인 Separation of Concerns라는 개념이 등장한다.

이를 객체지향에 적용해서 관심이 있는 것 끼리는 모이게 하고, 관심 밖 객체는 따로 떨어지게 나누어서 서로 영향을 주지 않도록 분리하는 것이라고 생각할 수 있다.

그럼 지금부터 변화를 유연하게 수용할 수 있는 코드로 Dao 클래스를 재작성해보자.

## 커넥션 만드는 것 부터 뽑아내보자

UserDao에 구현된 메소드들을 잘 살펴보면 add 메소드 하나에서만 적어도 세 가지 관심사항을 발견할 수 있다.

1. DB 연결을 위한 커넧견을 가져오는 방법에 대한 관심이다. 더 세분화해보면 어떤 DB를 사용할지, 어떤 드라이버를 사용할지 등 구체화할 수 있다.

2. 사용자 등록을 위해 SQL 문장을 담을 Statement를 만들고 실행하는 것이다. 여기서의 관심사는 파라미터로 넘어온 사용자 정보를 Statement에 바인딩시키고 Statement에 담긴 SQL을 DB를 통해 실행시키는 방법이다.

3. 작업이 끝나면 사용한 리소스인 Statement와 Connection 오브젝트를 닫아줘서 리소르를 반환해주어야한다.

(생각해보니 초난감이라는 말도 되게 촌스러운 유행어네 지금보니까)

## 중복 코드의 메소드를 추출하자

```kotlin
class UserDao {

    init {
        val connection = getConnection()

        val prepareStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        prepareStatement.execute()
    }

    fun addUser(user: User) {

        val connection = getConnection()

        val prepareStatement = connection.prepareStatement(
                "insert into user(id,name,password) values(?,?,?)"
        )
        prepareStatement.setLong(1, user.id)
        prepareStatement.setString(2, user.name)
        prepareStatement.setString(3, user.password)

        prepareStatement.execute()
        prepareStatement.close()
        connection.close()
    }

    fun getUser(id: Long): User {

        val connection = getConnection()

        val preparedStatement = connection.prepareStatement(
                "select * from user where id = ?"
        )
        preparedStatement.setLong(1, id)

        val resultSet = preparedStatement.executeQuery()
        resultSet.next()
        val user = User(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("password")
        )

        resultSet.close()
        preparedStatement.close()
        connection.close()

        return user
    }

    private fun getConnection(): Connection {
        Class.forName("org.h2.Driver")
        return DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")
    }
    
}
```

이처럼 공통된 중복 코드를 함수로 뽑아내는 것을 extract method 기법이라고 부른다.

그리고 이처럼 코드를 깔끔하게 만드는 과정을 리팩토링이라고 부르며 반드시 익혀야하는 기법이기도 하다. (리팩토링 2판 나왔던데 사야겠다.)

## DB 커넥션 만들기를 아예 별도로 독립시켜버리자

UserDao를 조금 더 유연한 구조로 갖기 위해서는 getConnection 메소드를 추상 메소드로 만들 수 있다.

그 후 UserDao를 상속받은 클래스들이 getConnection 메소드를 구현하게 하여 어떤 DB를 사용하던지 유연하게 대처하게 할 수 있다.

```kotlin
abstract class UserDao {

    init {
        val connection = getConnection()

        val prepareStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        prepareStatement.execute()
    }

    fun addUser(user: User) {

        val connection = getConnection()

        val prepareStatement = connection.prepareStatement(
                "insert into user(id,name,password) values(?,?,?)"
        )
        prepareStatement.setLong(1, user.id)
        prepareStatement.setString(2, user.name)
        prepareStatement.setString(3, user.password)

        prepareStatement.execute()
        prepareStatement.close()
        connection.close()
    }

    fun getUser(id: Long): User {

        val connection = getConnection()

        val preparedStatement = connection.prepareStatement(
                "select * from user where id = ?"
        )
        preparedStatement.setLong(1, id)

        val resultSet = preparedStatement.executeQuery()
        resultSet.next()
        val user = User(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("password")
        )

        resultSet.close()
        preparedStatement.close()
        connection.close()

        return user
    }

    abstract fun getConnection(): Connection
}
```

```kotlin
class KakaoUserDao: UserDao() {
    override fun getConnection(): Connection {
        Class.forName("org.h2.Driver")
        return DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")
    }
}
```

```kotlin
class NaverUserDao: UserDao() {
    override fun getConnection(): Connection {
        TODO("Naver DB Connection 생성코드")
    }
}
```

이제 DAO의 핵심 기능인 데이터를 등록하고 가져올 것인가에 대한 관심사인 UserDao와 DB 연결을 어떻게 할 것인가라는 관심을 갖고 있는 KakaoUserDao와 NaverUserDao가 클래스 레벨로 구분이 되고 있다.

이제 UserDao는 변경이 용이한 수준을 넘어 확장 가능한 구조를 갖게 되었다.

위와 같이 슈퍼 클래스에 로직의 흐름을 정의하고 기능의 일부를 추상 메소드나 오버라이딩이 가능한 메소드로 만든 뒤 서브 클래스에서 정의하는 방식을 디자인 패턴에서 **템플릿 메소드 패턴**이라고 부른다.

템플릿 메소드 패턴은 스프링에서 애용되는 디자인 패턴이다.

UserDao의 리턴 타입인 Connection 클래스는 UserDao를 구현하는 구현체들이 어떤 방식으로 Connection 객체를 만들어내는지도 순전히 NaverUserDao와 KakaoUserDao의 관심사인 것이다.

그렇다면 이러한 팩토리 메소드 패턴의 단점은 무엇일까?

컴퓨터 사이언스는 모든 것들이 `trade-off` 관계에 있다.

비슷한 문구로 `No Silver Bullet`이라는 문구와 비슷한 용어이기도 하다.

즉, 모든 것들은 장단점이 있기 마련이고 모든 것을 관통하는 **은총알**이라는 것은 소프트웨어에서는 존재하지 않는다.

결국 여기서는 상속을 사용했다는 것이 단점이다.

자바는 기본적으로 다중상속을 지원하지 않으며, 자바의 상속은 문제점이 많기때문에(제임스 고슬링의 후회) 상속을 가급적 사용하지 않는 방법으로 구조를 잡아야한다.

## DAO의 확장

모든 객체는 변한다.

지금까지는 데이터 액세스 로직에 대한 관심사와 DB 연결을 어떤 방법으로 할 것인가라는 두 개의 관심을 상속 관계로 표현하였다.

추상 클래스를 만들고 이를 상속한 서브클래스에서 변화가 필요한 부분을 바꿔서 쓸 수 있게 만든 이유는 이런 변화의 성격이 다른 것을 분리하여

서로 영향을 주지 않은 채로 각각 필요한 시점에 독립적으로 변경할 수 있게 하기 위해서이다.

그러나 단점이 더 많은 상속이라는 방법을 사용했다는 것이 문제라고 할 수 있겠다.

그럼 아예 클래스를 분리해버리는 것은 어떨까?

지금부터는 getConnection을 추상메소드가 아닌, 독립된 클래스로 만들고 이 객체가 Connection을 반환하는 책임을 갖게 설계해볼 것이다.

```kotlin
class SimpleConnectionMaker {

    fun makeConnection(): Connection {
        Class.forName("org.h2.Driver")
        return DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")
    }
}
```

```kotlin
open class UserDao {

    private val simpleConnectionMaker = SimpleConnectionMaker()

    init {
        val connection = simpleConnectionMaker.makeConnection()

        val prepareStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        prepareStatement.execute()
    }

    fun addUser(user: User) {

        val connection = simpleConnectionMaker.makeConnection()

        val prepareStatement = connection.prepareStatement(
                "insert into user(id,name,password) values(?,?,?)"
        )
        prepareStatement.setLong(1, user.id)
        prepareStatement.setString(2, user.name)
        prepareStatement.setString(3, user.password)

        prepareStatement.execute()
        prepareStatement.close()
        connection.close()
    }

    fun getUser(id: Long): User {

        val connection = simpleConnectionMaker.makeConnection()

        val preparedStatement = connection.prepareStatement(
                "select * from user where id = ?"
        )
        preparedStatement.setLong(1, id)

        val resultSet = preparedStatement.executeQuery()
        resultSet.next()
        val user = User(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("password")
        )

        resultSet.close()
        preparedStatement.close()
        connection.close()

        return user
    }
}
```

UserDao 클래스는 더 이상 추상 클래스가 아니며 SimpleConnectionMaker가 Connection을 반환할 책임을 갖게 된다.

테스트 코드는 여전히 잘 작동하며 바뀐 것은 없고 내부 설계를 변경해서 코드만 개선했을 뿐이다.

문제는 DB 커넥션 기능을 확장하는게 불가능해졌다.

다시 처음의 문제로 되돌아와버린 것이다.

이 경우 상속을 사용했을 때와 마찬가지로 자유로운 확장이 가능하게 하려면 결국 **두 가지** 문제를 해결해야한다.

1. SimpleConnectionMaker의 메소드의 문제를 해결해야한다.
    - 만약 Naver가 openConnection()이라는 이름을 사용하면 UserDao의 addUser(), getUser() 내부 코드를 다 변경해야한다.

2. DB 커넥션을 제공하는 클래스가 어떤 것인지를 UserDao가 구체적으로 알아야한다.
   - Kakao가 다른 클래스를 구현하려면 어쩔 수 없이 UserDao 자체를 다시 수정해야한다.

## 인터페이스를 도입하여 확장해보자

앞서 언급한 문제를 가장 쉽게 풀 수 있는 방법은 **추상화**이다.

ConnectionMaker를 인터페이스로 두고 Kakao와 Naver가 각각 이 인터페이스를 구현하게 하면 된다.

```kotlin
interface ConnectionMaker {

    fun makeConnection():Connection
}
```

```kotlin
class KakaoConnectionMaker:ConnectionMaker {

    override fun makeConnection(): Connection {
        Class.forName("org.h2.Driver")
        return DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "")
    }
}
```

```
class NaverConnectionMaker:ConnectionMaker {
    override fun makeConnection(): Connection {
        TODO("Naver에서만 사용하는 독자적 DB Connection 생성코드")
    }
}
```

```kotlin
open class UserDao {

    private val simpleConnectionMaker:ConnectionMaker = KakaoConnectionMaker()

    init {
        val connection = simpleConnectionMaker.makeConnection()

        val prepareStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        prepareStatement.execute()
    }

    ... 중략

```

이제 ConnectionMaker 인터페이스의 구현체들을 사용하면 UserDao 클래스를 바꾸는 일은 없을 것 같다.

그런데 문제는 KakaoConnectionMaker 클래스가 여전히 보인다.

인터페이스를 이용해서 UserDao의 수정을 줄이고 싶었는데 또 다시 원점이다.

## 관계 설정 책임의 분리

UserDao와 ConnectionMaker로 화끈하게 나눴는데도 불구하고 여전히 ConnectionMaker의 구현체를 알아야한다는 문제점이 남아있다.

이 문제점은 UserDao의 코드를 변경해야한다는 원초적인 문제를 여전히 해결하지 못했다.

그런데 가만 생각해보면 결국 이 UserDao를 사용하는 클라이언트가 분명히 존재할 것이다.

그렇다면 우리는 UserDao의 클라이언트가 이 구현체를 결정하게 해두면 될 일이다.

<img width="589" alt="스크린샷 2020-06-21 오전 12 54 51" src="https://user-images.githubusercontent.com/43809168/85205983-d5e16080-b359-11ea-836f-a0d1b1d047a2.png">

현재 구조는 UserDao가 ConnectionMaker의 구현체에 의존관계를 갖는 형태를 띄고 있다.

이는 우리가 원하는 바가 아니며 이러한 관계를 나누기 위해 클라이언트가 이 ConnectionMaker의 구현체를 정하게 해주도록 하겠다.

지금 같은 경우 UserDao의 클라이언트는 테스트코드라고 할 수 있겠다.

```kotlin
open class UserDao(
        private val connectionMaker:ConnectionMaker
) {

    init {
        val connection = connectionMaker.makeConnection()

        val prepareStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS user(id INT,name varchar(30),password varchar(30))"
        )

        prepareStatement.execute()
    }
    ... 중략
```

```kotlin
class UserDaoTest {
    @Test
    fun crud() {

        // given

        val userDao = UserDao(KakaoConnectionMaker()) // 테스트코드가 구현체를 정의했다.

        val user = User(
                123,
                "harry",
                "code"
        )

        // when
        userDao.addUser(user)
        val findUser = userDao.getUser(user.id)

        assertEquals(user.name,findUser.name)
        assertEquals(user.password,findUser.password)
    }
}
```

이처럼 구현체를 런타임에 의존하게 함으로써 UserDao와 ConnectionMaker를 완전히 분리하고 변화에 능동적인 구조를 만들었다.

이렇게 인터페이스를 만들고 클라이언트의 도움을 받는 방법은 상속보다 훨씬 유연하다.

<img width="572" alt="스크린샷 2020-06-21 오전 1 00 10" src="https://user-images.githubusercontent.com/43809168/85206090-91a29000-b35a-11ea-97d4-1fb161cdb95e.png">

## 원칙과 패턴

개방 폐쇄 원칙을 이용하면 지금까지 해온 리팩토링 작업의 특징과 최종적으로 개선된 설계와 코드의 장점이 무엇인지 효과적으로 설명할 수 있다.

여기서 사용된 원칙과 패턴을 간략하게 정리해두고 글을 마치도록 하겠다.

- 객체지향 5 원칙 SOLID

- 템플릿 메소드 패턴 ( 추상 클래스를 상속받아 구현하는 구조의 디자인 패턴 )

- 전략 패턴( UserDaoTest - UserDao - ConnectionMkaer 구조의 디자인 패턴 )

## Reference

토비의 스프링 - 이일민

