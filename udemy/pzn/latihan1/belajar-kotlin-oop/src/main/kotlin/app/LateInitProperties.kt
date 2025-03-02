package app

import data.Television

fun main() {
    val tv = Television()
//    println(tv.brand) // error karena nilai belum di inisialisasikan

    tv.initTelevision("Xiaomi TV")
    println(tv.brand)

    tv.brand = "Samsung"
    println(tv.brand)
}