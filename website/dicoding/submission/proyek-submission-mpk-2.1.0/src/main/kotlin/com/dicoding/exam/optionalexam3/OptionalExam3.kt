package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val text = str.toList()
    val isNumber = text.filter { it.isDigit() }
    val number = isNumber.joinToString(separator = "").toIntOrNull()
    val isChar = text.filterNot { it.isDigit() }
    val char = isChar.joinToString(separator = "")

    if (number != null && int >= 1 && int <= 100) {
        val result = number * int

        return char + result.toString()
    } else {
        return str + int
    }
}
