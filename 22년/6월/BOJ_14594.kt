import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val t = readLine().toInt()

    val arr = IntArray(n + 1){ 0 }

    for(i in 0 until t){
        val tmp = readLine().split(" ")
        for(j in tmp[0].toInt() until tmp[1].toInt()){
            arr[j] = 1
        }
    }

    var count = 0

    for(i in 1 .. n){
        if(arr[i] == 0)
            count++
    }

    println(count)
}