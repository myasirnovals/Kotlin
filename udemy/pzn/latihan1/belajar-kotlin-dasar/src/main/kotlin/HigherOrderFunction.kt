fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Yasir Noval", lambdaUpper))

    println(hello("Yasir Noval", {
        value: String -> value.toLowerCase()
    }))

    val result1 = hello("Yasir Noval", {
        value: String -> value.toUpperCase()
    })

    val result2 = hello("Yasir Noval") { value: String ->
        value.toUpperCase()
    }
}