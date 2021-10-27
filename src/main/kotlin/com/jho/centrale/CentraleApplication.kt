package com.jho.centrale

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication(exclude = [ DataSourceAutoConfiguration::class ])
@ComponentScan

class CentraleApplication

fun main(args: Array<String>) {
	runApplication<CentraleApplication>(*args)
}