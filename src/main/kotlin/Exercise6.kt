package org.example
/*
* Lambda Expression :
*  Use a lambda expression to filter a list of numbers (e.g., `[5, 10, 15, 20, 25]`)
* to include only the numbers divisible by 5, and then print the filtered list.
* */

fun main() {
    var numbers = mutableListOf(5, 10, 15, 20, 25, 11, 22, 43, 45, 67, 65)
    numbers = numbers.filter { n -> n % 5 == 0 }.toMutableList()
    println(numbers)

}