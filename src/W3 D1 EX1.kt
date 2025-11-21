//Week 3, day 1, exercise 1 to 3
fun main() {
    val names = arrayOf("Gabriel", "Maria", "Igor", "José", "Paula")
    println("Names list: ${names.contentToString()}")

    //exercise 2
    names[2] = "João"
    println("New list: ${names.contentToString()}")

    //exercise 3
    val grade = arrayOf(0.0, 0.0, 0.0, 0.0)
    for (i in 1..grade.size){
        print("Type score $i: ")
        grade[i-1] = readln().toDouble()
    }
    val scoreAverage = (grade.sum() / grade.size)
    println("Your grades: ${grade.contentToString()}\nAverage score: $scoreAverage")
}