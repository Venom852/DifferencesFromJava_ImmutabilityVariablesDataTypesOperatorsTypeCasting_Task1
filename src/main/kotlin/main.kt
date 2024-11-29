package ru.netology

fun main () {
    val amount = 14654
    val minimumCommission = 35
    val commission = amount * 0.0075 + minimumCommission

    println("Комиссия составляет $commission руб.")
}