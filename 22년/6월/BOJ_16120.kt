import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main()= with(BufferedReader(InputStreamReader(System.`in`))){
    val str = readLine()
    val stack = Stack<Char>()

    for(i in 0 until str.length){
        if(str[i] == 'P')
            stack.push('P')
        else{
            if(stack.size >= 2 && i < str.length - 1 && str[i + 1] == 'P'){
                stack.pop()
                stack.pop()
            } else{
                println("NP")
                return
            }
        }
    }

    if(stack.size == 1)
        println("PPAP")
    else
        println("NP")
}