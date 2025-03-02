fun main(args: Array<String>) {
    val hari = 4
    
    val hasil = when (hari) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Tidak valid"
    }
    
    println(hasil)
}
