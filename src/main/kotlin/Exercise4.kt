package org.example

/*
*  Create a list of your favorite programming languages.
* A>
* Add a new language to the list and then remove one language. Finally, print the updated list.
*
*
* B>
*  Create a program perform basic operations(Add, remove, Update, copy...) on mutable and unmutable list, map, and set
* */
fun main() {

    //a
    val favLanguages = mutableListOf("Java", "Base", "Python", "C")
    println("Original List: $favLanguages")

    //add
    favLanguages.add("Kotlin")
    println("List after Adding Operation: $favLanguages")

    //remove
    favLanguages.remove("Base")
    println("List after remove Operation: $favLanguages")

    //update
    favLanguages[favLanguages.size - 1] = "C++"
    println("List after Update Operation: $favLanguages")

    println()
    println("ImmutableList ===> ")
    println()

    //Immutable List

    val immutableList = listOf("Udemy", "LinkedIn Learning", "O'Reilly")

    //Creating copy of immutable list
    val learningPortals = immutableList.toList()
    println("Copy if immutableList : $learningPortals")

    //Read
    println("First element from immutable list : ${immutableList.get(0)}")

    //Update - create a new list to perform update
    val mutableList = immutableList.toMutableList();
    mutableList[0] = "YouTube"
    println("List after Update Operation: $mutableList")

    //Delete - create a new list
    val newList = immutableList.filter { learning -> learning != "Udemy" }
    println("Removelement and create a new list: $newList")


}