import java.io.File

fun main() {
    val input = File("Input.txt").readLines()
    val compare = input.map { x -> compareSequence(x.split(',')[0], x.split(',')[1]) }.count { x -> x }
    println(compare)
}

fun compareSequence(seq1: String, seq2: String): Boolean{
    val firstNumber = (seq1.split('-')[0].toInt() <= seq2.split('-')[0].toInt())
    val secondNumber = (seq1.split('-')[1].toInt() >= seq2.split('-')[1].toInt())
    val firstNumberReverse = (seq2.split('-')[0].toInt() <= seq1.split('-')[0].toInt())
    val secondNumberReverse = (seq2.split('-')[1].toInt() >= seq1.split('-')[1].toInt())
    val result = (firstNumber && secondNumber) || (firstNumberReverse && secondNumberReverse)
    return  (firstNumber && secondNumber) || (firstNumberReverse && secondNumberReverse)
}
