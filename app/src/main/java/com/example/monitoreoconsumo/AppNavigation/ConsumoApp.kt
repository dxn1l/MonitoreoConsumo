package com.example.monitoreoconsumo.AppNavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.monitoreoconsumo.Screens.BathScreen
import com.example.monitoreoconsumo.Screens.CocinaScreen
import com.example.monitoreoconsumo.Screens.ConsumptionScreen
import com.example.monitoreoconsumo.Screens.DormitorioScreen
import com.example.monitoreoconsumo.Screens.GreetingScreen

@Composable
fun ConsumoApp() {

    var currentScreen by remember { mutableStateOf(Screen.Gretting) }

    when (currentScreen) {
        Screen.Gretting -> GreetingScreen(
            onNavigateToConsumption = { currentScreen = Screen.Consumption }
        )
        Screen.Consumption -> ConsumptionScreen(
            onNavigateToDormitorio = { currentScreen = Screen.Dormitorio },
            onNavigateToCocina = { currentScreen = Screen.Cocina },
            onNavigateToBath = { currentScreen = Screen.Bath }
        )
        Screen.Dormitorio ->  DormitorioScreen (
            onNavigateToConsumption = { currentScreen = Screen.Consumption }
        )
        Screen.Cocina ->  CocinaScreen (
            onNavigateToConsumption = { currentScreen = Screen.Consumption }
        )
        Screen.Bath ->   BathScreen (
            onNavigateToConsumption = { currentScreen = Screen.Consumption }
        )
    }



}

enum class Screen {
    Gretting,
    Consumption,
    Bath,
    Cocina,
    Dormitorio
}