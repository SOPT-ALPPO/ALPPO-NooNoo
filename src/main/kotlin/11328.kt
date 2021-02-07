fun main() {
    val times = readLine()!!.toInt()
    repeat(times) {
        val firstWordFrequency = MutableList('z' - 'a' + 1) { 0 }
        val secondWordFrequency = MutableList('z' - 'a' + 1) { 0 }

        val words = readLine()!!.split(" ")
        words[0].map { firstWordFrequency[it - 'a']++ }
        words[1].map { secondWordFrequency[it - 'a']++ }
        if(isEqual(firstWordFrequency, secondWordFrequency))
            println("Possible")
        else
            println("Impossible")
    }
}

fun isEqual(first: MutableList<Int>, second: MutableList<Int>): Boolean {
    return first.zip(second)
        .all { (first, second) -> first == second }
}