package com.example.monitoreoconsumo.Screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.monitoreoconsumo.Charts.CustomLineChart
import com.example.monitoreoconsumo.DataGeneration.generateEnergyData

@Composable
fun DormitorioScreen(modifier: Modifier = Modifier, onNavigateToConsumption: () -> Unit) {
    var data by remember { mutableStateOf<List<Pair<Int, Int>>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Dormitorio",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            isLoading = true
            generateEnergyData { generatedData ->
                data = generatedData
                isLoading = false
                Log.d("DormitorioScreen", "Data generated: $data")
            }
        }) {
            Text(text = "Gasto energético")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateToConsumption) {
            Text(text = "Volver a la pantalla principal")
        }
        if (isLoading) {
            Text(text = "Cargando...", fontSize = 20.sp, fontWeight = FontWeight.Medium)
        } else if (data.isNotEmpty()) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    AndroidView(
                        factory = { CustomLineChart(context).apply { setData(data) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text = "Datos de Consumo", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
                items(data) { item ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Tiempo: ${item.first}h")
                        Text(text = "Consumo: ${item.second}kW")
                    }
                }
                item {
                    Spacer(modifier = Modifier.height(16.dp))
                    val recommendation = getRecommendation(data)
                    Log.d("DormitorioScreen", "Recommendation: $recommendation")
                    Text(text = recommendation, fontSize = 18.sp, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}

