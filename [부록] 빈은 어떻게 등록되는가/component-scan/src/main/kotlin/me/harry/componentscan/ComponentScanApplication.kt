package me.harry.componentscan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ComponentScanApplication

fun main(args: Array<String>) {
    runApplication<ComponentScanApplication>(*args)
}
