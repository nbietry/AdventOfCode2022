import java.io.File

fun main() {
    val input = File("Input.txt").readLines()
    val result = input.sumOf { x -> getValue(x) }
    println("$result")
}

fun getValue(inString: String): Int {

    val a = inString.substring(0, inString.toString().length / 2).toList()
    val b = inString.substring(inString.toString().length / 2 ).toList()
    val result = a.intersect(b).toCharArray()
    if(result[0].code > 90) return result[0].code - 96
    else return result[0].code - 38
}
