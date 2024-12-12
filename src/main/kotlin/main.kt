package ru.netology

import kotlin.math.roundToInt

fun main() {
    val amount = 14654
    val commission = if (amount * 0.0075 > 35) (amount * 0.0075).roundToInt() else 35

    println("Комиссия составляет $commission руб.")
}