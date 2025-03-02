fun main(args: Array<String>) {
    val a = 7
    val b = 17
    
    val cek = if (a > b) {
        println("a lebih besar dari b")
        a
    } else {
        println("b lebih besar dari a")
        b
    }
    
    println("cek = $cek")
}
