fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hellp $firstName $lastName")
    }
}

fun main() {
    hello("Yasir", "Noval")
    hello("Budi")
    hello("Joko", "Nugroho")
}