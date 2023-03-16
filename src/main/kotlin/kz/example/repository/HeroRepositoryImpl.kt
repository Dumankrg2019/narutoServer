package kz.example.repository

import kz.example.models.ApiResponse
import kz.example.models.Hero

class HeroRepositoryImpl: HeroRepository {
    override val heroes: Map<Int, List<Hero>>
        get() = TODO("Not yet implemented")
    override val pag1: List<Hero>
        get() = TODO("Not yet implemented")
    override val pag2: List<Hero>
        get() = TODO("Not yet implemented")
    override val pag3: List<Hero>
        get() = TODO("Not yet implemented")
    override val pag4: List<Hero>
        get() = TODO("Not yet implemented")
    override val pag5: List<Hero>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchHeroes(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}