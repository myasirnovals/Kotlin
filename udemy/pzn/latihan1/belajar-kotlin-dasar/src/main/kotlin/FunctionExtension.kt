fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
	val name = "Yasir Noval"

	println(name.hello())

	name.printHello()
}