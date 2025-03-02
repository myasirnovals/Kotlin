var model: Array<String?> = arrayOfNulls(10)

fun main() {

    viewShowTodoList()
}

// LOGIC FUNCTION
/*Menampilkan todolist*/
fun showTodolist() {
    println("TODOLIST")

    for (i in 1..<model.size) {
        val todo = model[i]

        if (todo != null) {
            println("$i. $todo")
        }
    }
}

/*Menambahkan todolist*/
fun addTodoList(todo: String) {
    // cek apakah model sudah penuh
    var isFull = true

    for (i in 1..<model.size) {
        if (model[i] == null) {
            // model masih ada yang kosong
            isFull = false
            break
        }
    }

    // jika penuh, kita resize ukuran array 2x lipat
    if (isFull) {
        val temp = model
        model = arrayOfNulls(model.size * 2)

        for (i in 1..<temp.size) {
            model[i] = temp[i]
        }
    }

    // tambahkan ke posisi yang data array nya Null
    for (i in 1..<model.size) {
        if (model[i] == null) {
            model[i] = todo
            break
        }
    }
}

/*Menghapus todolist*/
fun removeTodoList(number: Int): Boolean {
    if ((number) >= model.size) {
        return false
    } else if (model[number] == null) {
        return false
    } else {
        for (i in number..<model.size) {
            if (i == (model.size - 1)) {
                model[i] = null
            } else {
                model[i] = model[i + 1]
            }
        }

        return true
    }
}

/*Menambahkan fungsi input*/
fun input(info: String): String {
    print("$info : ")
    val data = readln()
    return data
}

/*Menampilkan view todolist*/
fun viewShowTodoList() {
    while (true) {
        showTodolist()

        println("MENU : ")
        println("1. Tambah")
        println("2. Hapus")
        println("x. Keluar")

        val input = input("Pilih")

        if (input == "1") {
            viewAddTodoList()
        } else if (input == "2") {
            viewRemoveTodoList()
        } else if (input == "x" || input == "X") {
            break
        } else {
            println("Pilihan tidak dimengerti")
        }
    }
}

/*Menampilkan view menambahkan todolist*/
fun viewAddTodoList() {
    println("MENAMBAHKAN TODOLIST")

    val todo = input("Todo (x jika batal)")

    if (todo == "x" || todo == "X") {
        // batal
    } else {
        addTodoList(todo)
    }
}

/*Menampilkan view menghapus todolist*/
fun viewRemoveTodoList() {
    println("MENGHAPUS TODOLIST")

    val number = input("Nomor yang Dihapus (x jika batal)")

    if (number == "x" || number == "X") {
        // batal
    } else {
        val success = removeTodoList(Integer.valueOf(number))

        if (!success) {
            println("Gagal menghapus todolist : $number")
        }
    }
}

// TESTING FOR LOGIC FUNCTION
fun testShowTodoList() {
    model[1] = "Belajar Kotlin Dasar"
    model[2] = "Belajar Kotlin OOP"

    showTodolist()
}

fun testAddTodoList() {
    for (i in 1..25) {
        addTodoList("Contoh Todo Ke-$i")
    }

    showTodolist()
}

fun testRemoveTodoList() {
    addTodoList("Satu")
    addTodoList("Dua")
    addTodoList("Tiga")
    addTodoList("Empat")
    addTodoList("Lima")

    var result = removeTodoList(20)
    println(result)

    result = removeTodoList(7)
    println(result)

    result = removeTodoList(3)
    println(result)

    showTodolist()
}

fun testInput() {
    val name = input("Derek Westbrook")
    println("Hi $name")

    val testing = input("Testing")
    println(testing)
}

fun testViewShowTodoList() {
    addTodoList("Satu")
    addTodoList("Dua")
    addTodoList("Tiga")
    addTodoList("Empat")
    addTodoList("Lima")

    viewShowTodoList()
}

fun testViewAddTodoList() {
    addTodoList("Satu")
    addTodoList("Dua")

    viewAddTodoList()

    showTodolist()
}

fun testViewRemoveTodoList() {
    addTodoList("Satu")
    addTodoList("Dua")
    addTodoList("Tiga")

    showTodolist()

    viewRemoveTodoList()

    showTodolist()
}