package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name: ${any.name}")
    } else if (any is HandPhone) {
        println("HanPhone with name: ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name: ${any.name}")
        is HandPhone -> println("HanPhone with name: ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String

    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String

    println(value)
}

fun main() {
    printObject("Yasir")
    printObject(1)
    printObject(Laptop("Lenovo"))
    printObject(HandPhone("Samsung"))

    println("\n")
    printObjectWithWhen("Yasir")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Lenovo Ide Pad"))
    printObjectWithWhen(HandPhone("Xiaomi"))

    println("\n")
    printString("Yasir")
//    printString(1) // Error Unsafe Cast

    println("\n")
    printStringSafe("Yasir")
    printStringSafe(1) // null
}