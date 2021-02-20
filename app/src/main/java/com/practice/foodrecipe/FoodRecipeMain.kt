package com.practice.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class FoodRecipeMain : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setup bottom bar
        val navHostFragment: NavHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        this.navController = navHostFragment.navController
        val appBarConfig = AppBarConfiguration(setOf(
            R.id.receipePage, R.id.favoritePage, R.id.jokePage
        ))
        bottomNavigationView?.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfig)
    }

    override fun onSupportNavigateUp(): Boolean {
        return this.navController.navigateUp() || super.onSupportNavigateUp()
    }

    companion object {
        private val TAG: String = FoodRecipeMain::javaClass.name
    }
}