//Week 3, Day 5, Exercise 1 to 3

fun main() {
    //Exercise 1
    val numbers = arrayOf(10, 5, 4, 13, 55, 44, 1, 9, 5, 16)
    println("Numbers list:")
    numbers.forEach{println(it)}
    println("\nAll numbers summed: ${numbers.sum()}")

    //Exercise 2
    println("\nExercise 2\n")
    println("All even numbers: ")
    for (even in numbers) {
        if (even % 2 == 0) {
            println(even)
        }
    }

    //Exercise 3
    println("\nExercise 3\n")
    val colors = arrayOf("Red", "Blue", "Green", "Yellow", "Orange", "Purple", "Pink", "Brown", "Black", "White")
    println("Color list: ${colors.contentToString()}")
    colors.forEach {
        if (it.length < 6) {
            println(it)
        }
    }
}
