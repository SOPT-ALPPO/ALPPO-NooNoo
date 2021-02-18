fun main() {
    val bw = System.out.bufferedWriter()
    val input = readLine()!!.split(" ")
        .map { it.toInt() }
    val climbDistance = input[0]
    val slipDistance = input[1]
    val stickDistance = input[2]
    var days = (stickDistance - slipDistance).div(climbDistance - slipDistance)
    val reminder = (stickDistance - slipDistance).rem(climbDistance - slipDistance)
    if (reminder != 0) { days++ }
    bw.write("$days")
    bw.flush()
}
