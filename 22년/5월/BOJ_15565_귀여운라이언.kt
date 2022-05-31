import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = readLine().split(" ")
    val n = st[0].toInt()
    val m = st[1].toInt()

    val arr = readLine().split(" ").map { i -> i.toInt() }

    var list = mutableListOf<Int>()
    var min = n + 1

    for(i in 0 until n){
        if(arr[i] == 1)
            list.add(i)
    }

    if(list.size < m){
        print(-1)
        return@with
    }

    for(i in 0 until list.size){
        var end = i
        var cnt = 0

        while(end < list.size && cnt < m){
            cnt++
            end++
        }

        if(cnt == m){
            min = min(min, list.get(end - 1) - list.get(i) + 1)
        }
    }

    println(min)

}