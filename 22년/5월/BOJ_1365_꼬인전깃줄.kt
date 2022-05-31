import java.io.BufferedReader
import java.io.InputStreamReader


private lateinit var dp: Array<Int>

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()

    val arr = Array<Int>(n){0}

    val tmp = readLine().split(" ")

    for(i in 0 until n){
        arr[i] = tmp[i].toInt()
    }

    dp = Array<Int>(n + 1){0}
    var len = 0
    var idx = 0

    for(i in 0 until n){
        if(arr[i] > dp[len]){
            len++
            dp[len] = arr[i]
            continue
        }

        idx = binarySearch(0, len, arr[i])
        dp[idx] = arr[i]
    }

    println(n - len)
}

private fun binarySearch(left: Int, right: Int, key: Int): Int{
    var l = left
    var r = right
    while(l < r){
        var mid = (l + r) / 2
        if(dp[mid] > key)
            r = mid
        else
            l = mid + 1
    }

    return r
}