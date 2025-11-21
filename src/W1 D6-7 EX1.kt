//Week 1, Day 6-7, Exercise 1 to 3

fun myAddition(num1: Int, num2: Int) = (num1 + num2)
fun mySubtraction(num1: Int, num2: Int) = (num1 - num2)
fun myMultiplication(num1: Int, num2: Int) = (num1 * num2)
fun myDivision(num1: Int, num2: Int) = (num1 / num2)

fun celsiusToFahrenheit(temperature: Double): String {
    return ("%.2f".format((temperature * 9/5) + 32).toString())
}
fun userRegister(name:String, age:Int, city:String) :String {
    val msm = "--- User Profile --- \nName: $name \nAge: $age \nCity: $city"
    return (msm)
}

fun main() {
    print("Type number 1: ")
    val number1:Int = readln().toInt()
    print("Type number 2: ")
    val number2:Int = readln().toInt()

    println("$number1 + $number2 = ${myAddition(number1, number2)}")
    println("$number1 - $number2 = ${mySubtraction(number1, number2)}")
    println("$number1 X $number2 = ${myMultiplication(number1, number2)}")
    println("$number1 / $number2 = ${myDivision(number1, number2)}")

    //Exercise 2
    println("\n---Exercise 2---\n")
    print("Type the temperature in celsius: ")
    val temp: Double = readln().toDouble()

    println("$temp ºC = ${celsiusToFahrenheit(temp)} ºF")

    //Exercise 3
    println("\n---Exercise 3---\n")
    print("Type your name: ")
    val userName = readln()
    print("Type your age: ")
    val userAge = readln().toInt()
    print("Type your city: ")
    val userCity = readln()
    println(userRegister(userName, userAge, userCity))

}
