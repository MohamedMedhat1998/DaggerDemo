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
        val appComponent = (application as MainApplication).appComponent
        val coffeeComponent =
            DaggerCoffeeComponent.builder().appComponent(appComponent).sugar(1).milk(4).build()
        coffeeComponent.inject(this)
        Log.d("Tracking", "coffee1 $coffee")
        Log.d("Tracking", "coffee2 $coffee2")
        Log.d("Tracking", "river1 ${coffee.river}")
        Log.d("Tracking", "river2 ${coffee2.river}")
    }
}