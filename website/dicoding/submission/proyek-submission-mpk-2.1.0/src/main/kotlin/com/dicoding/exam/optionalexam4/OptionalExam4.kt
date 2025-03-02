package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    if (string.length in 1..100) {
        val listOfString = string.toList()

        if (listOfString.size % 2 == 0) {
            val middleList = (listOfString.size / 2)
            val middleWord = listOfString.slice(middleList - 1 until middleList + 1)

            return middleWord.joinToString(separator = "")
        } else {
            val middleList = (listOfString.size / 2)
            val middleWord = listOfString[middleList]

            return middleWord.toString()
        }
    } else {
        return "Error: LengthOfStringOutOfBoundsException: Length:${string.length}, SizeOfLength: 100"
    }
}