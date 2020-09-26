package com.example.daggerdemo

import javax.inject.Inject
import javax.inject.Singleton

/* Injected the constructor here because [Coffee] depends on [Farm].
Doing this, the [CoffeeComponent] -Which is responsible for providing a [Coffee]- will be able to use a [Farm] instance.
*/
@Singleton
class Farm @Inject constructor() {
    fun getBeans(): String {
        return "Beans"
    }
}