import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var word = readLine()
    val w = readLine()

    var answer = 0
    var i = 0

    while(i <= word.length - w.length){
        var idx = 0
        while(idx < w.length && w[idx] == word[i + idx]){
            idx++
        }

        if(idx == w.length){
            answer++
            i += idx
        }else
            i++
    }

    println(answer)
}