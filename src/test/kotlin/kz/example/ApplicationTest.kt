package kz.example

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.testing.*
import kotlin.test.*
import io.ktor.http.*
import kotlinx.coroutines.processNextEventInCurrentThread
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kz.example.models.ApiResponse
import kz.example.plugins.*
import kz.example.repository.HeroRepository
import org.koin.java.KoinJavaComponent.inject

import org.koin.ktor.ext.inject


class ApplicationTest {
    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)
    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Welcome to Naruto API!", bodyAsText())
        }
    }
}
