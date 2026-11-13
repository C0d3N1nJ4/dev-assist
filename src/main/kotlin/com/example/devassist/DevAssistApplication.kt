package com.example.devassist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevAssistApplication

fun main(args: Array<String>) {
    runApplication<DevAssistApplication>(*args)
}
