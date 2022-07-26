package _08_functional

fun repeat(times: Int, body: (Int) -> Unit) {
    for (index in 0 until times) {
        body(index)
    }
}

fun main() {
    repeat(5, { println("Hello") })

    repeat(5) {
        println("Wow, I am outside of the func")
    }
}