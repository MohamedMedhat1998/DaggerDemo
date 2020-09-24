package com.example.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val farm: Farm = Farm()
        val river: River = River()
        val coffee: Coffee = Coffee(farm, river)
    }
}