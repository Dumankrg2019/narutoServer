package kz.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import kz.example.routes.getAllHeroes
import kz.example.routes.root

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
    }
}
