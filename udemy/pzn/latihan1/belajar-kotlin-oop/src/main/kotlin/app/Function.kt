package app

import data.Person

fun main() {
    val yasir = Person()
    yasir.firstName = "Muhamad"
    yasir.middleName = "Yasir"
    yasir.lastName = "Noval"

    yasir.sayHello("Budi")
    yasir.run()

    val fullName = yasir.getFullName()
    println(fullName)
}