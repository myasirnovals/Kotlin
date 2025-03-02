fun main() {
    val names: Array<String> = arrayOf("Dika", "Erick", "Yasir", "Yusron")
    // names.set(0, "rudi")
    names[0] = "Rudi"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10, 9, 8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Yasir"
    members[1] = "Yusron"
    members[2] = "Dika"
    members[3] = "Erick"
    members[4] = "Aria"
    println(members.size)
}