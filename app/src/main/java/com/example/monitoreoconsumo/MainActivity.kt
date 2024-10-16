package com.example.monitoreoconsumo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.monitoreoconsumo.AppNavigation.ConsumoApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                ConsumoApp()
        }
    }
}

