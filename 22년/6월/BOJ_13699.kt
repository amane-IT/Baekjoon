import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var arr = LongArray(36){0}

    arr[0] = 1

    for(i in 1 .. 35){
        for(j in 1 .. i){
            val t = i - j
            val a = arr[i - j]
            val b = arr[j - 1]
            arr[i] += a * b
        }
    }

    val n = readLine().toInt()
    println(arr[n])
}