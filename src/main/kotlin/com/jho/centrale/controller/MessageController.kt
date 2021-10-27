package com.jho.centrale

import org.springframework.web.bind.annotation.*

data class Message(val id: String?, val text: String)

val FAKE_LIST: List<Message> = listOf(
    Message("1", "Hello!"),
    Message("2", "Bonjour!"),
    Message("3", "Privet!"),
)

@RestController
@RequestMapping("messages")
class MessageController {
    @GetMapping("/{id}")
    fun getId(@PathVariable id: String): String {
        return id
    }

    @GetMapping
    fun getAll(@RequestParam(required = false) id: String?): List<Message> {
        return FAKE_LIST
    }
}

