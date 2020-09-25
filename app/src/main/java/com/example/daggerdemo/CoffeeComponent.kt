package com.example.daggerdemo

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Responsible for providing instances of the [Coffee].
 */
@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build(): CoffeeComponent

        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk milk: Int): Builder
    }
}