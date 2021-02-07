import java.lang.Exception

fun main() {
    val times = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    repeat(times) {
        val command = readLine()!!.split(" ")
        when (command.first()) {
            "push" -> list.push(command.last().toInt())
            "pop" -> println(list.pop())
            "size" -> println(list.size)
            "empty" -> println(list.empty())
            "top" -> println(list.top())
        }
    }
}

fun MutableList<Int>.push(value: Int) {
    this.add(value)
}

fun MutableList<Int>.pop(): Int {
    return try { this.removeAt(this.lastIndex) }
    catch (e: Exception) { -1 }
}

fun MutableList<Int>.empty(): Int = if (this.isEmpty()) 1 else 0

fun MutableList<Int>.top(): Int = if (this.isEmpty()) -1 else this.last()