import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val num = readLine().split(" ")
    val n = num[0].toInt()
    val s = num[1].toInt()
    val m = num[2].toInt()

    val arr = readLine().split(" ")
    val vol = IntArray(m + 1){-1}

    vol[s] = 0

    val list = mutableListOf<Int>()

    for(i in 1 .. n){
        list.clear()

        for(j in 0 .. m){
            if(vol[j] == i - 1){
                if(j - arr[i - 1].toInt() in 0..m){
                    list.add(j - arr[i - 1].toInt())
                }

                if(j + arr[i - 1].toInt() in 0..m){
                    list.add(j + arr[i - 1].toInt())
                }
            }
        }

        for(j in 0 until list.size){
            vol[list[j]] = i
        }
    }

    for(i in m downTo 0){
        if(vol[i] == n){
            println(i)
            return
        }
    }
    println(-1)
}