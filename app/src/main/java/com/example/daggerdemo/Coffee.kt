package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor() {
    @Inject
    lateinit var farm: Farm

    @Inject
    lateinit var river: River

    fun getCoffeeCup(): String {
        return "${farm.getBeans()} + ${river.getWater()}"
    }

    @Inject
    fun connectElectricity() {
        Log.d("Coffee", "Electricity connected")
    }
}