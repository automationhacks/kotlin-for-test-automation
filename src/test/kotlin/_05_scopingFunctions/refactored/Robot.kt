package _05_scopingFunctions.refactored

class Robot(val name: String, val function: String, val weight: Int)

fun main() {
    val chappie = Robot("Chappie", "Fight", 25)

    with(chappie) {
        println("Robot is $name who does $function with weight $weight")
    }
}