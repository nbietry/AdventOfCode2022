import java.io.BufferedReader
import java.io.File
import java.util.stream.Collectors



fun main() {
    val bufferedReader: BufferedReader = File("Input.txt").bufferedReader()
    val inputString = bufferedReader.use { it.readText() }
    //println(inputString)

    val arrayOfElf = inputString.split("\n\n")
    val response = arrayOfElf.map { x-> x.split('\n').toList().map{it.toInt()}.reduce() { x, y -> x + y  } }
        .sortedDescending()[0]
    println(response)
}

