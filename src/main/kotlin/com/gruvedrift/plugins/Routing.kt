package com.gruvedrift.plugins

import com.gruvedrift.example.ExpandMiningFacade
import com.gruvedrift.example.init
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            init()
            call.respondText("Ready to mine!")
        }
    }
}
