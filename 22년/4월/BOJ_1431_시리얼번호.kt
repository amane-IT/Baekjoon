import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections

private data class Numbers(val size: Int, val str: String, val cnt: Int)

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val list = mutableListOf<Numbers>()

    for(i in 0 until n){
        val tmp = readLine()
        var cnt = 0
        for(t in tmp){
            if(t.isDigit())
                cnt += (t - '0')
        }

        list.add(Numbers(tmp.length, tmp, cnt))
    }

    list.sortWith(compareBy<Numbers> {it.size}.thenBy { it.cnt }.thenBy { it.str })

    for(i in list){
        println(i.str)
    }
}