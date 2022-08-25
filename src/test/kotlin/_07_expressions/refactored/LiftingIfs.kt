package _07_expressions.refactored

// Simple HTTP response class
class Response(val statusCode: Int)

fun main() {
    // A sample response
    val response = Response(200)

    // Conditional statement which decides and gives a value out for further consumption
    val result: String
    result = if (response.statusCode == 200) {
        "Success"
    } else {
        "Failure"
    }

    println("API call results is : $result")
}