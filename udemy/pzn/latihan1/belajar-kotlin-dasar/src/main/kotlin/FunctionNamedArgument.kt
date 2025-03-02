fun fullName(
    firstName: String,
    middleName: String,
    lastName: String,
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Muhamad", "Yasir", "Noval")
    fullName(
        middleName = "Yasir",
        lastName = "Noval",
        firstName = "Muhamad",
    )
}
