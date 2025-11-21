//Week 4, Day 3, Exercise 1 to 3

fun getting(name:String="ChatGPT") {
    println("Hello $name!")
}

fun voucher(name: String, value: Double, rate: Double=0.15) {
    println("Client: $name\n\nPrice: $ ${"%.2f".format(value)} | | Rate: ${rate*100}% \nTotal: $ ${"%.2f".format(value * (1 + rate))}")
    println("Payment received.")
}

fun main() {
    getting()
    getting("Gabriel")

    //exercise 3
    voucher("Gabriel", 150.00)
}
