package org.example
/*
*  **Null Safety:**
* Write a program to implement null safe variable.
* */

fun main() {
    //1 ?.
    val greetings: String? = null
    println(greetings?.length)

    //2 Elvis Operator ?: to provide a default value
    val messageLength = greetings?.length?: "NA"
    println("Print length with default values : $messageLength")

}