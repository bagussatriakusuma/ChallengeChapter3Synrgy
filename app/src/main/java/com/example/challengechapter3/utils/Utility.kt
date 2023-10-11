package com.example.challengechapter3.utils

import android.graphics.Color
import java.util.Random

fun randomizeBackgroundColor(): Int {
    val colors = listOf(
        "#E13300",
        "#7358FF",
        "#1E3264",
        "#E8125C",
        "#158A08",
        "#E9142A",
        "#2A40A7",
        "#82609D",
        "#006450",
        "#7358FF",
        "#E91429",
        "#D84000",
        "#BC5900",
    )

    val random = Random()
    val randomColor = colors[random.nextInt(colors.size)]

    return Color.parseColor(randomColor)
}