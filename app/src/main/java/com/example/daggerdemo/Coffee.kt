package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(@Sugar val sugar: Int, @Milk val milk: Int) {
    @Inject
    lateinit var farm: Farm

    @Inject
    lateinit var river: River

    fun getCoffeeCup(): String {
        return "${farm.getBeans()} + ${river.getWater()} + Sugar:$sugar + Milk:$milk\nfarm:$farm"
    }

    @Inject
    fun connectElectricity() {
        Log.d("Coffee", "Electricity connected")
    }
}