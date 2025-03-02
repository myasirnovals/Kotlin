package app

import data.City
import data.Country

fun main() {
    val city = City("Bandung")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}