const val APPLICATION = "Belajara kotlin dasar"
const val VERSION = "1.0.0"

fun main() {
    val firstName = "Yasir"
    val age = 18

    println(firstName)
    println(age)

    var name: String? = null
    name = "Yasir"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}