package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numbers = number.toString()
    val digitNumber = numbers.map { it.toString().toInt() }

    if (digitNumber.size in 2..9) {
        val smallestNumber = digitNumber.min()
        val largestNumber = digitNumber.max()

        return smallestNumber + largestNumber
    } else {
        return -1
    }
}
