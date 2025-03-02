fun main() {
    var i = 0

    while (true) {
        println("Perulangan ke-$i")
        i++

        if (i > 5) {
            break
        }
    }

    for (i in 1..100) {
        if (i % 2 == 1) {
            continue
        }

        println("Angka ke-$i")
    }
}