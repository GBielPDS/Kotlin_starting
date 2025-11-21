//Week 2, day 4, exercise 3
fun main() {
    print("Type a number: ")
    val number: Int = readln().toInt()
    val result = when (number) {
        0 -> "Your number is '0'"
        1 -> "Your number is '1'"
        2 -> "Your number is '2'"
        else -> "Your name isn't 0, 1 or 2"
    }
    println(result)
}