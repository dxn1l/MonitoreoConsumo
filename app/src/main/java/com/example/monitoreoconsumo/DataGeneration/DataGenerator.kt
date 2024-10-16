package com.example.monitoreoconsumo.DataGeneration

import android.os.Handler
import android.os.Looper

fun generateEnergyData(onDataGenerated: (List<Pair<Int, Int>>) -> Unit) {
    Thread {
        val data = mutableListOf<Pair<Int, Int>>()
        for (i in 1..10) {
            val consumption = (1..100).random() // Simulated energy consumption in kilowatts
            val time = i // Simulated time
            data.add(Pair(time, consumption))
            Thread.sleep(1000) // Simulate time delay
        }
        Handler(Looper.getMainLooper()).post {
            onDataGenerated(data)
        }
    }.start()
}