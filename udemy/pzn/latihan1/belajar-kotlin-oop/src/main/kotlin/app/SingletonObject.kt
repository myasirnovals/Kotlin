package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Diubah"

    println(Utilities.toUpper("yasir"))
    a()
    b()

    println(Application.Companion.toUpper("Yasir"))
    println(Application.toUpper("Yasir"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}