import java.io.File

fun main() {
    val input = File("Input.txt").readText()

    val valuesDict = mapOf("A" to 1, "B" to 2, "C" to 3)
    val correspond = mapOf("X" to "A", "Y" to "B", "Z" to "C")
    val rules = mapOf("A A" to 3, "B B" to 3, "C C" to 3, "A B" to 0, "A C" to 6, "B A" to 6, "B C" to 0, "C A" to 0,
        "C B" to 6)
    val valuePlayer = input.split('\n').map { x-> x.split(' ')[0] + " " + correspond[x.split(' ')[1]]}
    val scorePlayer1 = valuePlayer.map { x -> rules[x]!!.toInt() + valuesDict[x.split(' ')[0]]!!.toInt() }.sum()
    val scorePlayer2 = valuePlayer.map { x -> rules[x.reversed()]!!.toInt() + valuesDict[x.split(' ')[1]]!!.toInt() }
        .sum()
    println(scorePlayer1.toString() + " " + scorePlayer2.toString())

}
