package com.example.devassist.controller

import org.springframework.ai.chat.client.ChatClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class AiController(private val chatClient: ChatClient) {

    @GetMapping("/assist")
    fun getAssistance(@RequestParam prompt: String): Map<String, String> {
        val response = chatClient.prompt()
            .user(prompt)
            .call()
            .content()

        return mapOf("response" to response)
    }
}
