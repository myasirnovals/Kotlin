fun main(args: Array<String>) {
    val hari = 12
    
    when (hari) {
        1 -> {
            println("Nilai hari = 1")
            println("Maka, hari = Senin")
        }
        2 -> {
            println("Nilai hari = 2")
            println("Maka, hari = Selasa")
        }
        3 -> {
            println("Nilai hari = 3")
            println("Maka, hari = Rabu")
        }
        4 -> {
            println("Nilai hari = 4")
            println("Maka, hari = Kamis")
        }
        5 -> {
            println("Nilai hari = 5")
            println("Maka, hari = Jumat")
        }
        6 -> {
            println("Nilai hari = 6")
            println("Maka, hari = Sabtu")
        }
        7 -> {
            println("Nilai hari = 7")
            println("Maka, hari = Minggu")
        }
        else -> {
            println("Nilai hari = $hari")
            println("Maka, hari = tidak valid")
        }
    }
}
