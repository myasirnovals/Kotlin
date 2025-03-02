package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Yasir")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")
}