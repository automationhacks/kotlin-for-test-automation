package _07_expressions.refactored

fun readme(text: String?): String? {
    val result = text?.length
    println(result)

    // Print each char
    text?.forEach(::print)
    println()

    // Typical ways of handing null values
    // give default value if text is null

    if (text == null) return null
    // You can throw an exception in case you are working with Java code
    // And are not sure if the object is nullable or not
    // if (text == null) throw RuntimeException("Unexpected null")
    // if (text == null) error("Unexpected null")

    return ""
}

fun main() {
    readme("Welcome to wonderful world of kotlin!")
    readme(null)
}