package app

import data.Cat
import data.Dog

fun main() {
    val cat = Cat()
    println(cat.name)
    cat.voice()

    val dog = Dog()
    println(dog.name)
    dog.voice()

}