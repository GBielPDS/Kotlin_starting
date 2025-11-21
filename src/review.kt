//Review

fun main() {
    val names = mutableListOf<String>()
    val grades = mutableListOf<Double>()
    var quit = false
    var name: String
    var grade: Double
    var menu:Int

    do {
        print("1. Add student\n2. Show all students and grades\n3. Calculate class average\n4. Verify student registered\n5. Quit")
        menu = readln().toInt()
        when (menu) {
            1 -> {
                print("Name: ")
                name = readln().lowercase()
                print("Grade: ")
                grade = readln().toDouble()
                names.add(name)
                grades.add(grade)
                println("Student registered!\nName: $name\nGrade: $grade")
            }
            2 -> {
                for (i in 1..names.size) {
                    println("Student $i \n${names[i-1]}: ${grades[i-1]}\n\n")
                }
            }
            3 -> {
                println("Class average: ${grades.sum() / grades.size}")
            }
            4 -> {
                print("Name: ")
                name = readln().lowercase()
                if (name in names) {
                    val position = names.indexOf(name)
                    println("Student ${position + 1} \n${names[position]}: ${grades[position]}")
                }
                else {
                    println("Student $name was not found.")
                }
            }
            5 -> {
                quit = true
            }
            else -> {
                println("Type a valid number.")
            }
        }
    } while (!quit)
    println("System Shutdown!")

}