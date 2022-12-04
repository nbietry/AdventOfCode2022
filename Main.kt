import java.io.BufferedReader
import java.io.File

fun main() {
    val bufferedReader: BufferedReader = File("Input.txt").bufferedReader()
    val inputString = bufferedReader.use { it.readText() }

    val input = inputString.split("\n\n")
    val arrayOfElf = input.map { x-> x.split('\n').toList().map{it.toInt()}.reduce() { x, y -> x + y  } }
        .sortedDescending()
    println(arrayOfElf[0] + arrayOfElf[1] + arrayOfElf[2])
}

