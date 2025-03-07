fun main() {
    tailrec fun display(value: Int): Int {
        println("Recursive $value")
        if (value > 0) {
            return display(value - 1)
        } else {
            return display(1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when(value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(10))
}