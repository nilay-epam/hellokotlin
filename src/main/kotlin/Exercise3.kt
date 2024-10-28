package org.example
/*
Count number of vowels in sentence
 */
class Exercise3 {

    private fun countVowel(sentence: String) : Int{
        val vowels : String = "aeiouAEIOU"
        val vowelLength : Int = sentence.count{alpha -> alpha in vowels}

        return vowelLength;
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val sentence : String = "Kotlin is concise and expressive"
            val vowelLen = Exercise3().countVowel(sentence)
            println("Length of vowels in sentence are : $vowelLen")
        }
    }
}