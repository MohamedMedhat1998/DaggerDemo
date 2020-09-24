package com.example.daggerdemo

import dagger.Module
import dagger.Provides

// We use modules when we can't use @Inject in some class (from a library for e.g.)
@Module
class CoffeeModule(val sugar: Int) {

    @Provides
    fun provideRiver(): River {
        return River()
    }

    @Provides
    fun provideSugar(): Int {
        return sugar
    }
}