fun jumlah(a: Int = 0, b: Int = 0): Int {
    return a + b
}

fun kurang(a: Int = 0, b: Int = 0): Int {
    return a - b
}

fun kali(a: Int = 0, b: Int = 0): Int {
    return a * b
}

fun bagi(a: Int = 0, b: Int = 0): Int {
    return a / b
}

fun main(args: Array<String>) {
    var a = 20
    var b = 4
    var hasil: Int
    
    hasil = jumlah(a, b)
    println("$a + $b = $hasil")
    
    hasil = kurang(a, b)
    println("$a - $b = $hasil")
    
    hasil = kali(a, b)
    println("$a * $b = $hasil")
    
    hasil = bagi(a, b)
    println("$a / $b = $hasil")
}
