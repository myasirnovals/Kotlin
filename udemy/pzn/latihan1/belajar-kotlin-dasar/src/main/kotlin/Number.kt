fun main() {
    // decimal
    var age: Int = 200
    var balance: Long = 1000000L

    println(age)

    // floating point
    var value: Float = 90.8F
    var radius: Double = 12345.321

    println(value)

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xAA
    var binaryLiteral: Int = 0b10101010

    println(binaryLiteral)

    // underscore in number
    var price: Long = 9_000_000_000L

    println(price)

    // conversion
    var priceInt: Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binaryLiteral.toDouble()
    println(doubleBinary)
}