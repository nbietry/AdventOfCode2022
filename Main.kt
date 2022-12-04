import java.io.File

fun main() {
    val input = File("Input.txt").readLines()
    val inputListGrouped = input.withIndex()
                                .groupBy { it.index / 3 }
                                .map { it.value.map { it.value } }
                                .map { x-> getValue(x[0], x[1], x[2]) }.sum()
    println("$inputListGrouped")
}

fun getValue(inString1: String, inString2: String, inString3: String): Int {

    val firstIntersec = inString1.toList().intersect(inString2.toList().toSet()).toCharArray()
    val result = firstIntersec.intersect(inString3.toList().toSet()).toCharArray()
    if(result[0].code > 90) return result[0].code - 96
    else return result[0].code - 38
}
