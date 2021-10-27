package com.jho.centrale

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

//@SpringBootApplication(exclude = [ DataSourceAutoConfiguration::class ])
@SpringBootApplication
@ComponentScan

class CentraleApplication

fun main(args: Array<String>) {
	runApplication<CentraleApplication>(*args)
}