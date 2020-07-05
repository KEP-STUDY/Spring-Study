package me.harry.componentscan


import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ComponentScanApplicationTests {

    @Autowired
    lateinit var testObj:TestObj

    @Test
    fun contextLoads() {
        println(testObj.id)

    }
}
