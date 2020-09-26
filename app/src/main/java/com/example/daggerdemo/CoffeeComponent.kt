package com.example.daggerdemo

import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Responsible for providing instances of the [Coffee].
 */
@ActivityScope
@Subcomponent
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun build(): CoffeeComponent

        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk milk: Int): Builder
    }
}