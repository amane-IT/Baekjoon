import java.io.BufferedReader
import java.io.InputStreamReader

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    var ans = 0
    val n = readLine().toInt()
    val arr = IntArray(n)

    for(i in 0 until n){
        arr[i] = readLine().toInt()
    }

    for(i in n - 2 downTo 0){
        if(arr[i] >= arr[i + 1]){
            val diff = arr[i] - arr[i + 1] + 1
            ans += diff
            arr[i] -= diff
        }
    }

    println(ans)
}