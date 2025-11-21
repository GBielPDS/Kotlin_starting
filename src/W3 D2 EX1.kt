//Week 3, day 1, exercise 1 to 3
fun main() {
    var schedule = mutableListOf<String>("go to the gym", "Home work", "Study Kotlin")
    println("Today schedule: $schedule")

    //exercise 2
    println("\"${schedule[1]}\" was removed from the schedule.")
    schedule.removeAt(1)
    println("Today schedule: $schedule")

    //exercise3
    println("Verifications")
    println("Is \"Study Kotlin\" in the schedule: ${schedule.contains("Study Kotlin")}")
    println("Is \"Home Work\" in the schedule: ${schedule.contains("Home work")}")
}