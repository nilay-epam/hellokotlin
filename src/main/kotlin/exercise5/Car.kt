package org.example.exercise5

data class Car(val make: String, val model: String, val year : Int){

}

fun main() {
    val myCar = Car("Honda", "VX", 2023)
    println(myCar)

}