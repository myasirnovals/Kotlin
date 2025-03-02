package data

abstract class Animal {
    abstract val name: String
    abstract fun voice(): Unit
}

class Cat: Animal() {
    override val name: String = "Cat"
    override fun voice() {
        println("nyaaa...")
    }
}

class Dog: Animal() {
    override val name: String = "Dog"
    override fun voice() {
        println("Woof Woof")
    }
}