package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Coffee @Inject constructor() {
    @Inject
    lateinit var farm: Farm

    @Inject
    lateinit var river: River

    @set:[Inject Named("sugar")]
    var sugar: Int = 0

    fun getCoffeeCup(): String {
        return "${farm.getBeans()} + ${river.getWater()} + $sugar"
    }

    @Inject
    fun connectElectricity() {
        Log.d("Coffee", "Electricity connected")
    }
}