//Week 4, Day 5, Exercise 1 to 3

fun addition(num1: Int, num2: Int) = (num1 + num2)

fun subtraction(num1: Int, num2 : Int) = (num1 - num2)

fun mathOperation(operation: (Int, Int) -> Int, num1: Int, num2: Int) :Int {
    val result: Int = operation(num1,num2)
    return result
}

fun getString() :String {
    print("Type a message: ")
    val msm = readln()
    return (msm)
}

fun messageUppercaseReverse(text: String) = (text.uppercase().reversed())

fun main() {
    val myAdd: (Int, Int) -> Int = ::addition
    val myMinus: (Int, Int) -> Int = ::subtraction
    println("4 + 8 = ${myAdd(4,8)}")

    //Exercise 2
    println("\n---Exercise 2---\n")
    println("5 + 3 = ${mathOperation(myAdd, 5, 3)}")
    println("5 - 3 = ${mathOperation(myMinus, 5, 3)}")

    //Exercise 3
    println("\n---Exercise 3---\n")
    val msm = getString()
    println("Text: ${messageUppercaseReverse(msm)}")
}
