package _01_bean.refactored

import org.testng.Assert

class Person(
        val name: String,
        val age: Int
)

fun main() {
    val person = Person("Jack", 30)
    Assert.assertEquals(person.name, "Jack")
    Assert.assertEquals(person.age, 30)
}
