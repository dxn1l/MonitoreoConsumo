package com.example.monitoreoconsumo.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.util.Calendar

@Composable
fun GreetingScreen(onNavigateToConsumption: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            Text(text = "${getGreeting()}, Usuario!")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onNavigateToConsumption) {
                Text(text = "Ver Consumo")
            }
        }
    }
}

fun getGreeting(): String {
    val hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    return when (hour) {
        in 0..11 -> "Buenos días"
        in 12..17 -> "Buenas tardes"
        else -> "Buenas noches"
    }
}