package app

import data.Boss

fun main() {
    val boss = Boss("Yasir")

    val employee1 = boss.Employee("Joko")
    val employee2 = boss.Employee("Budi")

    employee1.hi()
    employee2.hi()
}