package com.example.daggerdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = (application as MainApplication).coffeeComponent
        component.inject(this)
        Log.d("MainActivity", coffee.getCoffeeCup())
        Log.d("MainActivity", coffee2.getCoffeeCup())
    }
}