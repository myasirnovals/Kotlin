package app

import data.Person

fun main() {
    val yasir = Person()
    yasir.firstName = "Yasir"

    yasir.sayHello("Budi")
    yasir.sayHello("Joko", "Morro")
}