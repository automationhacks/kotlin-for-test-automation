package _07_expressions.refactored

fun apiResponses(response: Response) = when (response.statusCode) {
    in setOf(200, 201, 204) -> "Success"
    300 -> "Redirection"
    400 -> "Bad request"
    401 -> "Unauthorized"
    500 -> "Server error"
    else -> "Unknown"
}

fun main() {
    val success = Response(200)
    val clientError = Response(400)

    println(apiResponses(success))
    println(apiResponses(clientError))
}