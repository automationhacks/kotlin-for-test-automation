package _01_bean

import org.testng.Assert
import org.testng.annotations.Test

class PersonRefactored(
    val name: String,
    val age: Int
)

@Test
fun testBeanValues() {
    val person = PersonRefactored("Jack", 30)
    Assert.assertEquals(person.name, "Jack")
    Assert.assertEquals(person.age, 30)
}
