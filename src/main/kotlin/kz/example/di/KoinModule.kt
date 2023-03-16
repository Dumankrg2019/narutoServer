package kz.example.di

import kz.example.repository.HeroRepository
import kz.example.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}