infix fun String.to(type: String): String {
	if (type == "UP") {
		return this.toUpperCase()
	} else {
		return this.toLowerCase()
	}
}

fun main() {
	val result = "Yasir Noval" to "UP"
	println(result)	
}