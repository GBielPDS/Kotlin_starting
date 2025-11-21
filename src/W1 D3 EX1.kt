//Week 1, day 3, exercise 1 to 3
fun main() {
    val num: Int = 5
    val doubleNum: Double = 8.62
    val letter: Char = 'G'
    val bool: Boolean = true
    val text: String = "Gabriel"
    println(
        "Int: $num\nDouble: $doubleNum\nChar: $letter\nBoolean: $bool\nString: $text")

    //exercise 2
    //println("Gabriel's age: " + num + "Gabriel's score: " + doubleNum)
    //I try that, but it doesn't work in Kotlin, so use the sign '$' to interpolate

    //exercise 3
    println("$text graduate? $bool")
}