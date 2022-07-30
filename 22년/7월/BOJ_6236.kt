import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val nm = readLine().split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    val arr = IntArray(n)
    var max = 0
    for(i in 0 until n){
        arr[i] = readLine().toInt()
        max = max(max, arr[i])
    }

    var low = max
    var high = 10_000 * 100_000
    var result = 0

    while(low <= high){
        val mid = (low + high) / 2

        if(m >= possiblePay(mid, n, m, arr)){
            result = mid
            high = mid - 1
        } else{
            low = mid + 1
        }
    }

    println(result)

}

fun possiblePay(mid: Int, n: Int, m: Int, pay: IntArray): Int{
    var now = mid
    var count = 1

    for(i in pay){
        now -= i
        if(now < 0){
            ++count
            now = mid - i
        }
    }

    return count
}