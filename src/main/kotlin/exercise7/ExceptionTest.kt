package org.example.exercise7

fun main() {
    val numString = "1111abc"

    try {
        val number = numString.toInt()
        println("Converted Number : $number")

    } catch (e: NumberFormatException) {
        println("Unable to convert $numString to Int : Message[${e.message}]")
    }
}