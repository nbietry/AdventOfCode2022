import java.io.File

fun main() {
    val input = File("Input.txt").readText().toCharArray()
    val stack : ArrayDeque<Char> = ArrayDeque()
    var index = 0
    while (stack.size < 14 ){
        if(stack.contains(input[index])) {
            while (stack.first() != input[index]) stack.removeFirst()
            stack.removeFirst()
        }
        stack.add(input[index])
        index += 1
    }
    println(index)
}