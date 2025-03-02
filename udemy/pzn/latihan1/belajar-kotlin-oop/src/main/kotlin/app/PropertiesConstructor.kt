package app

import data.User

fun main() {
    val user1 = User("Yasir", "rahasia")
    val user2 = User("Joko", "rahasia123")

    user1.username = "Budi"
    user1.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}