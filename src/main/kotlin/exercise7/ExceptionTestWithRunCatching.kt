package org.example.exercise7

fun main() {
    val convertedNum = runCatching {
        convertToNumber()
    }

    convertedNum.onSuccess { response ->
        println("Number converted successfully : $response")
    }.onFailure { exception ->
        println("Error: ${exception.message}")
    }
}

fun convertToNumber(): Int {
    val numString = "1111Abc"
    val number = numString.toInt()
    return number;
}