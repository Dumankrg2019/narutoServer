package kz.example.repository

import kz.example.models.ApiResponse
import kz.example.models.Hero

interface HeroRepository {

    val heroes: Map<Int, List<Hero>>

    val pag1: List<Hero>
    val pag2: List<Hero>
    val pag3: List<Hero>
    val pag4: List<Hero>
    val pag5: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHeroes(name: String): ApiResponse
}