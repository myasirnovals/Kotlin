fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Yasir", "Noval")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Yasir Noval"))

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Yasir Noval"))
}