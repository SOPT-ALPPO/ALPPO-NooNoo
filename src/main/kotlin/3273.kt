fun main() {
    readLine()
    var matchCount = 0
    val numberBag = readLine()!!.split(" ")
        .asSequence()
        .map { it.toInt() }
        .toList()
    val matchNumber = readLine()!!.toInt()
    numberBag.forEachIndexed { index, value ->
        for (otherIndex in ((index + 1) until numberBag.size)) {
            if(value + numberBag[otherIndex] == matchNumber) matchCount++
        }
    }
    print(matchCount)
}