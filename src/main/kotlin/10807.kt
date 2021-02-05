fun main() {
    readLine()
    val numberBag = readLine()!!.split(" ")
        .map { it.toInt() }
    val key = readLine()!!.toInt()
    print(numberBag.count { it == key })
}
