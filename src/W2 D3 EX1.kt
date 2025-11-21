//Week 2, day 3, exercise 1
fun main() {
    print("Type a number: ")
    val number: Int = readln().toInt()
    if (number > 0) {
        println("$number is a positive number.")
    }
    else if (number < 0) {
        println("$number is a negative number.")
    }
    else {
        println("0 is neutral number, neither positive, nor negative.")
    }
}