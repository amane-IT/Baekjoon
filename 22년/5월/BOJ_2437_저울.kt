import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val arr = IntArray(n)
    val st = readLine().split(" ")

    for(i in 0 until n){
        arr[i] = st[i].toInt()
    }

    Arrays.sort(arr)

    var sum = 0

    for(i in 0 until n){
        if(sum + 1 < arr[i]){
            break
        }

        sum += arr[i]
    }

    println(sum + 1)
}