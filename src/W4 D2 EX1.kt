//Week 4, Day 2, Exercise 1 to 3

fun getting(name: String, age: Int) {
    println("Hello $name! \nHappy $age years old!")
}

fun bmi(height: Double, weight: Double): Map<String, String> {
    val value = (weight / (height * height)).toDouble()
    val bmiMap= mutableMapOf<String, String>("BMI" to value.toString(), "BMI level" to "0")
    if (value < 18.5) {
        bmiMap["BMI level"] = "Underweight"
    }
    else if (value > 18.5 && value < 25) {
        bmiMap["BMI level"] = "Normal"
    }
    else if (value >= 25 && value <= 29.9) {
        bmiMap["BMI level"] = "overweight"
    }
    else if (value > 30) {
        bmiMap["BMI level"] = "Obese"
    }

    return (bmiMap)
}

fun majorNumber(number1: Int, number2: Int): Int {
    if (number1 > number2) {
        return (number1)
    }
    else {
        return (number2)
    }
}

fun main() {
    print("Type your name: ")
    val name: String = readln()
    print("Type your age: ")
    val age: Int = readln().toInt()
    getting(name, age)

    //Exercise 2
    println("\n---Exercise 2---\n")
    print("Type your weight in Kg: ")
    val weight: Double = readln().toDouble()
    print("Type your Height: ")
    val height: Double = readln().toDouble()
    for ((key, value) in bmi(height, weight)) {
        println("$key: $value")
    }

    //Exercise 3
    println("\n---Exercise 3---\n")
    print("Type number 1: ")
    val num1 = readln().toInt()
    print("Type number 2: ")
    val num2 = readln().toInt()
    println("The bigger number is: ${majorNumber(num1, num2)}")
}