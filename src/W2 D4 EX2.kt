//Week 2, day 4, exercise 2
fun main() {
    var menu: Int
    var itemList = arrayListOf<String>()
    println("\tWelcome!\n\nType only number on the menu.")

    while (true) {
        print("1. Register \n2. Edit \n3. Show items\n4. Quit \n ->")
        menu = readln().toInt()
        when (menu) {
            1 -> {
                print("Type the new product name: ")
                val item = readln()
                itemList.add(item)
                println("$item was registered.")
            }
            2 -> {
                print("What product do you want to edit: ")
                val item = readln()
                if (item in itemList) {
                    println("Product found.")
                    for (i in 0..(itemList.size - 1)) {
                        if (item == itemList[i]) {
                            print("Type product new name: ")
                            val newItem = readln()
                            itemList[i] = newItem
                            break
                        }
                    }
                } else {
                    println("Product didn't find.")
                }
            }
            3 -> {
                println(itemList)
            }
            4 -> {
                print("Program shut down.")
                break
            }
            else -> {
                println("Type a valid number!")
            }
        }
    }
}