import java.io.File

fun main() {
    val input = File("Input.txt").readText()

    val valuesDict = mapOf("A" to 1, "B" to 2, "C" to 3)
    val correspond = mapOf("X" to "A", "Y" to "B", "Z" to "C")
    val rules = mapOf("A A" to 3, "B B" to 3, "C C" to 3, "A B" to 0, "A C" to 6, "B A" to 6, "B C" to 0, "C A" to 0,
        "C B" to 6)
    val valuePlayer = input.split('\n').map { x-> x.split(' ')[0] + " " + correspond[x.split(' ')[1]]}
    println(valuePlayer)
    val scorePlayer1 = valuePlayer.map { x -> rules[x]!!.toInt() + valuesDict[x.split(' ')[0]]!!.toInt() }.sum()
    val scorePlayer2 = valuePlayer.map { x -> rules[x.reversed()]!!.toInt() + valuesDict[x.split(' ')[1]]!!.toInt() }
        .sum()
    println(scorePlayer1.toString() + " " + scorePlayer2.toString())

    /*
    val arrayOfElf = input.map { x-> x.split('\n').toList().map{it.toInt()}.reduce() { x, y -> x + y  } }
        .sortedDescending()
    println(arrayOfElf[0] + arrayOfElf[1] + arrayOfElf[2])
     */
}

fun transpose( matrix: List<List<String>> ) {
    return matrix.first().forEachIndexed {
            i, _ -> matrix.map { it.getOrNull(i) }
    }
}