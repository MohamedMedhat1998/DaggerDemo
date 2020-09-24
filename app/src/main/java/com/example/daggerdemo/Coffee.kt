package com.example.daggerdemo

import javax.inject.Inject

class Coffee @Inject constructor() {
    @Inject
    lateinit var farm: Farm

    @Inject
    lateinit var river: River

    fun getCoffeeCup(): String {
        return "${farm.getBeans()} + ${river.getWater()}"
    }
}