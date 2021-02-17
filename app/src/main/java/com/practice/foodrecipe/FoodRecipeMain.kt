package com.practice.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FoodRecipeMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        private val TAG: String = FoodRecipeMain::javaClass.name
    }
}