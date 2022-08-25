package _06_dataStructures.refactored

fun main() {
    val aMap = mapOf(
            "Flash" to 28,
            "Wonder women" to 100,
            "Batman" to 40
    )

    for ((key, value) in aMap.entries) {
        println("key $key -> $value")
    }
}