import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Long.max
import java.util.*

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    val tmp = readLine().split(" ")
    val n = tmp[0].toInt()
    val k = tmp[1].toInt()

    val arr = IntArray(n){0}

    for(i in 0 until n){
        arr[i] = readLine().toInt()
    }

    Arrays.sort(arr)

    var left = arr[0].toLong()
    var right = Integer.MAX_VALUE.toLong();
    var answer: Long = 0

    while(left <= right){
        val mid: Long = ((left + right) / 2).toLong()
        var cha: Long = 0

        for(i in 0 until n){
            if(arr[i] <= mid)
                cha += (mid - arr[i])
        }

        if(k >= cha){
            left = mid + 1
            answer = max(mid, answer)

        }
        else{
            right = mid - 1
        }
    }

    println(answer)
}