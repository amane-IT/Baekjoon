import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min
import java.util.Collections

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var st = readLine().split(" ")
    val n = st[0].toInt()
    val m = st[1].toInt()

    val list_odd = mutableListOf<Int>()
    val list_six = mutableListOf<Int>()

    for(i in 0 until m){
        st = readLine().split(" ")
        list_six.add(st[0].toInt())
        list_odd.add(st[1].toInt())
    }

    Collections.sort(list_odd)
    Collections.sort(list_six)

    var min = min(((n / 6) + if(n % 6 != 0) 1 else 0) * list_six[0], n * list_odd[0])
    min = min(min, ((n / 6) * list_six[0] + (n % 6) * list_odd[0]))

    println(min)
}