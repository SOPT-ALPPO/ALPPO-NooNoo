import java.util.*

fun main() {
    var str = readLine()!!
    do {
        val parathStack = ParathStack()
        str.map { parathStack.push(it.toString()) }
        if (parathStack.isBalanced()) { println("yes") }
        else { println("no") }
        str = readLine()!!
    } while (str != ".")
}

class ParathStack {
    val parathStack = Stack<String>()

    fun push(item: String) {
        if (isElement(item)) {
            when {
                parathStack.isEmpty() -> parathStack.push(item)
                isPopAble(item) -> parathStack.pop()
                else -> parathStack.push(item)
            }
        }
    }

    fun isBalanced() = parathStack.isEmpty()

    private fun isPopAble(item: String) =
        (parathStack.peek() == "(" && item == ")") ||
                (parathStack.peek() == "[" && item == "]")

    private fun isElement(item: String) =
        (item == "(") || (item == ")") || (item == "[") || (item == "]")
}