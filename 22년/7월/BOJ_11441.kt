import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var arr = IntArray(n + 1)
    var sum = 0
    val nums = readLine().split(" ")

    for(i in 0 until n){
        sum += nums[i].toInt()
        arr[i + 1] = sum
    }

    val m = readLine().toInt()
    for(i in 0 until m){
        val tmp = readLine().split(" ")
        println(arr[tmp[1].toInt()] - arr[tmp[0].toInt() - 1])
    }
}
