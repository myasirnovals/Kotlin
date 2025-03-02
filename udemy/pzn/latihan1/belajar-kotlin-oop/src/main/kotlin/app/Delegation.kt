package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Yasir")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Joko")
    baseDelegate.sayGoodBye("Budi")
}