package com.jho.centrale

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(exclude = [ DataSourceAutoConfiguration::class ])
class CentraleApplication

fun main(args: Array<String>) {
	runApplication<CentraleApplication>(*args)
}

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello!"),
		Message("2", "Bonjour!"),
		Message("3", "Privet!"),
	)
}

data class Message(val id: String?, val text: String)