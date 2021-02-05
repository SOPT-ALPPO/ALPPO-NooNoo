fun main() {
    val word = readLine()!!
    val frequencyList = MutableList('z' - 'a' + 1) { 0 }
    word.forEach { frequencyList[it - 'a']++ }
    frequencyList.map { print("$it ") }
}