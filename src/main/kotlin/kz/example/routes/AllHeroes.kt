package kz.example.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.example.models.ApiResponse
import kz.example.repository.HeroRepository
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun Route.getAllHeroes() {

    val heroRepository: HeroRepository by inject()

    get("/naruto/heroes") {
       try {
           val page = call.request.queryParameters["page"]?.toInt() ?: 1
           require(page in 1..5)

           val apiResponse = heroRepository.getAllHeroes(page = page)

           call.respond(
               message = apiResponse,
               status = HttpStatusCode.OK
           )
       } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
       } catch (e: IllegalArgumentException) {
           call.respond(
               message = ApiResponse(success = false, message = "Heroes not found."),
               status = HttpStatusCode.NotFound
           )
       }
    }
}