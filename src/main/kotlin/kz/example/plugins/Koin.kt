package kz.example.plugins

import io.ktor.server.application.*
import kz.example.di.koinModule
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
        modules(koinModule)
    }
}