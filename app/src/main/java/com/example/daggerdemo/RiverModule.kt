package com.example.daggerdemo

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// We use modules when we can't use @Inject in some class (from a library for e.g.)
@Module
class RiverModule {

    @Singleton
    @Provides
    fun provideRiver(): River {
        return River()
    }
}