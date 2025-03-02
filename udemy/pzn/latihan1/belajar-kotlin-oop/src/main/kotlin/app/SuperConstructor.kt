package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Yasir")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Yasir", 10_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}