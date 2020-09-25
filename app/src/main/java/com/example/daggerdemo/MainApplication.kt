package com.example.daggerdemo

import android.app.Application

class MainApplication : Application() {

    lateinit var coffeeComponent: CoffeeComponent

    override fun onCreate() {
        super.onCreate()
        coffeeComponent = DaggerCoffeeComponent.builder().milk(3).sugar(1).build()
    }
}