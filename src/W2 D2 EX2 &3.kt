//Week 2, day 2, exercise 2 and 3
fun main() {
    print("Type a number: ")
    val number: Int = readln().toInt()
    var inRange: Boolean = true
    if (number < 10 || number > 100) {
        inRange = false
    }
    if (!inRange) {
        print("$number is out the range 10 to 100")
    }
    else {
        print("$number is in the range 10 to 100")
    }
}