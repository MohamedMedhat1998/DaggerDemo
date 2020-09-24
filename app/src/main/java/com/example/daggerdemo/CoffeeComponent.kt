package com.example.daggerdemo

import dagger.Component

/**
 * Responsible for providing instances of the [Coffee].
 */
@Component
interface CoffeeComponent {
    fun getCoffee(): Coffee
}