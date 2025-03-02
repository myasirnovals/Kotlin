fun main() {
	fun sayHello(name: String = ""): String {
		return when(name) {
			"" -> "Hello Bro!"
			else -> "Hello $name"
		}

		// return if (name == "") {
		// 	println("Hello Bro")
		// } else {
		// 	println("Hello $name")
		// }
	} 

	println(sayHello())
	println(sayHello("Yasir Noval"))
}