import java.io.File

fun main() {
    val input = File("Input.txt").readText()

    val valuesDict = mapOf("A" to 1, "B" to 2, "C" to 3)
    val correspond = mapOf("X" to 0, "Y" to 3, "Z" to 6)
    val rules = mapOf("A A" to 3, "B B" to 3, "C C" to 3, "A B" to 0, "A C" to 6, "B A" to 6, "B C" to 0, "C A" to 0,
        "C B" to 6)
    val rulesStep2 = mapOf("A X" to "C", "A Y" to "A", "A Z" to "B",
                           "B X" to "A", "B Y" to "B", "B Z" to "C",
                           "C X" to "B", "C Y" to "C", "C Z" to "A")

    val valuePlayer = input.split('\n')
    println(valuePlayer)
    //val scorePlayer1 = valuePlayer.sumOf { x -> rules[x]!!.toInt() + valuesDict[x.split(' ')[0]]!!.toInt() }
    val scorePlayer2 = valuePlayer.sumOf { x -> valuesDict[rulesStep2[x]]!!.toInt() + correspond[x.split(' ')[1]]!!
        .toInt() }
    println("$scorePlayer2")

}
