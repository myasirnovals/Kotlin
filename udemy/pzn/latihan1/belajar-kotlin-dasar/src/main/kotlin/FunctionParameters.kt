fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Yasir", "Noval")
    sayHello("Budi", null)
    sayHello("Joko", "Morro")
}