package _08_functional.refactored

fun printEven() {
    val nums = (1..10).toList()
    nums.filter { it % 2 == 0 }
            .map { it * 2 }
            .also { println(it) }
}

fun main() {
    printEven()
}