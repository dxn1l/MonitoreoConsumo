package com.example.monitoreoconsumo.Charts

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class CustomLineChart @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LineChart(context, attrs, defStyleAttr) {

    fun setData(data: List<Pair<Int, Int>>) {
        val entries = data.map { Entry(it.first.toFloat(), it.second.toFloat()) }
        val dataSet = LineDataSet(entries, "Energy Consumption").apply {
            color = Color.BLUE
            valueTextColor = Color.BLACK
        }
        this.data = LineData(dataSet)
        this.invalidate()
    }

    init {
        this.xAxis.position = XAxis.XAxisPosition.BOTTOM
        this.axisRight.isEnabled = false
    }
}