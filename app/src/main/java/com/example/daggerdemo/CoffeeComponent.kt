package com.example.daggerdemo

import dagger.BindsInstance
import dagger.Component

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
        fun sugar(sugar: Int): Builder
    }
}