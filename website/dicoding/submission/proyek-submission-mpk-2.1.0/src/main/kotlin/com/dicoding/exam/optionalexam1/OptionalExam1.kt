package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    if (numbers.lastIndex <= 9) {
        val number = numbers.sorted().takeLast(3)

        return number.sum()
    } else {
        return -1
    }
}