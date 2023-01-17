package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import java.time.LocalTime

fun Application.configureRouting() {
    routing {
        get("/") {
            val current = LocalTime.now()
            call.respond(current.toString())
            println("Current  Time is: $current")
        }
    }
}
