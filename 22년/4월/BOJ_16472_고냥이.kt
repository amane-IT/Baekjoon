import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val str = readLine().toCharArray()

    var left = 0
    var right = 0
    var max = 0
    val alpha = Array<Int>(26){ 0 }

    alpha[str[right] - 'a']++
    var cnt = 1

    while(true){
        right++
        if(right == str.size)
            break

        alpha[str[right] - 'a']++

        if(alpha[str[right] - 'a'] == 1)
            cnt++

        while(cnt > n){
            val num = str[left] - 'a'
            alpha[num]--

            if(alpha[num] == 0)
                cnt--

            left++
        }

        max = max(max, right - left + 1)
    }
    println(max)
}