package _08_functional

fun printEven() {
    val nums = (1..100).toList()
    val list = mutableListOf<Int>()

    for (i in nums) {
        if (i % 2 == 0) {
            list.add(i)
        }
    }

    println(list)
}

fun main() {
    printEven()
}