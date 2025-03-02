fun main() {
    var firstName: String = "Yasir"
    var lastName: String = "Noval"
    var address: String = """
        Jalan sukamaju
        RT 02 RW 13
        Bandung
        Jawabarat
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}