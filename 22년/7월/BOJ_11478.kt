import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){

    val s = readLine()
    val set = hashSetOf<String>()

    for(i in s.length downTo 1){
        for(j in 0 until i){
            val tmp = s.substring(j, i)
            set.add(tmp)
        }
    }

    println(set.size)
}