import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = readLine().split(" ")
    val n = st[0].toInt()
    val m = st[1].toInt()

    val arr = IntArray(m)
    var min = 1
    var max = 0
    var ans = 0

    for(i in 0 until m){
        arr[i] = readLine().toInt()
        max = max(max, arr[i])
    }


    while(min <= max){
        var mid: Int = (min + max) / 2

        var sum = 0
        for(i in 0 until m){
            sum += arr[i] / mid
            sum += if(arr[i] % mid == 0) 0 else 1
        }

        if(sum > n){
            min = mid + 1
        } else{
            max = mid - 1
            ans = mid
        }
    }
    println(ans)

}