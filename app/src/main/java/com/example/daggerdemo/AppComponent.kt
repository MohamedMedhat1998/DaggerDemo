package com.example.daggerdemo

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RiverModule::class])
interface AppComponent {
    fun getRiver(): River
}