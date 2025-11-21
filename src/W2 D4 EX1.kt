//Week 2, day 4, exercise 1
fun main() {
    print("Type a number from 1 to 7: ")
    val number: Int = readln().toInt()
    val day = when (number) {
        1 -> "Sunday" //the first day of week is sunday in Brazil
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day"
    }
    println("Today is $day.")
}