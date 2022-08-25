package _07_expressions

class Response(val statusCode: Int)

fun main() {
    val response = Response(200)

    val result: String
    if (response.statusCode == 200) {
        result = "Success"
    } else {
        result = "Failure"
    }

    println("API call results is : $result")
}