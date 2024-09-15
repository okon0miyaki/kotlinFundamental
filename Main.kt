// Kotlin Fundamental

package org.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun greet(nama: String, waktu: String) {
   println("Selamat $waktu $nama !")

    val abc: Int = 6
    println("Campus ${if (abc < 7)"still closed" else "already open"}")
}

fun setUser(name: String, age: Int = 20) : String {
    return "Hello my name is $name, i'm $age years old."
}

fun sumNum(vararg num: Int) = num.sum()

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..2) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    repeat(2){
        println("Repeat")
    }

    val line: String = """
        Line 1
        Line 2
    """.trimIndent()

    println(line)

    greet("Admin","Sore")
    println(setUser(name = "Rangga"))
    println(sumNum(10, 20, 30, 40))

    val number = getNumberSize(10, 20, 30, 40, 50)
        println(number)

}