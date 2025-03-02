package app

import data.Person

fun main() {
    val yasir = Person()
    yasir.firstName = "Yasir"

    val joko = Person()
    joko.firstName = "Joko"

    val budi = Person()
    budi.firstName = "Budi"

    println(yasir.firstName)
    println(joko.firstName)
    println(budi.firstName)
}