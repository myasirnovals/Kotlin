fun main() {
    val nilai = "A"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }

        "B" -> {
            println("Good")
        }

        "C" -> {
            println("Not Bad")
        }

        "D" -> {
            println("Bad")
        }

        else -> {
            println("Try agin next year")
        }
    }

    when (nilai) {
        "A", "B", "C" -> {
            println("Selamat Anda lulus")
        }

        else -> {
            println("Maaf Anda tidak lulus")
        }
    }

    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("MAAF ANDA TIDAK LULUS")
    }

    val name = "Yasir"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang lagi tahun depan")
    }
}