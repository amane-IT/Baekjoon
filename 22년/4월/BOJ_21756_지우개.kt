import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var list = List<Int>(n, { i -> i + 1 })

    while(list.size != 1){
        val tmp = mutableListOf<Int>()
        for(i in 1 until list.size step 2){
            tmp.add(list.get(i))
        }
        list = tmp
    }

    println(list[0])

}