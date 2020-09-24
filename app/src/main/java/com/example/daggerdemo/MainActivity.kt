package com.example.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCoffeeComponent.builder().coffeeModule(CoffeeModule(5)).build()
        component.inject(this)
        Log.d("MainActivity", coffee.getCoffeeCup())
    }
}