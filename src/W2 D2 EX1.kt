//Week 2, day 2, exercise 1
fun main() {
    print("Type your age: ")
    val age: Int = readln().toInt()
    var driverLicence: Boolean = false
    var legalAge: Boolean
    if (age >= 18) {
        legalAge = true
        //18 years old is the legal age in Brazil
        print("Do you have a driver licence: \n1.Yes\t2.No\n ->")
        val answer = readln().uppercase()
        if (answer in "1YES") {
            driverLicence = true
        }
    }
    else{
        legalAge = false
    }
    println("Your age: $age \nLegal age: $legalAge \nDriver licence: $driverLicence")
}