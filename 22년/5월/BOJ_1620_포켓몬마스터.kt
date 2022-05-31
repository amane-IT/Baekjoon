import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = readLine().split(" ")
    val n = st[0].toInt()
    val m = st[1].toInt()
    val list = mutableListOf<String>()
    val map = mutableMapOf<String, Int>()
    list.add(" ")

    for(i in 1 .. n){
        val name = readLine()
        list.add(name)
        map.put(name, i)
    }

    for(i in 0 until m){
        val quest = readLine()
        if(isString(quest)){
            println(list.get(quest.toInt()))
        } else {
            println(map.get(quest))
        }
    }
}

private fun isString(s : String) : Boolean{
    try{
        s.toInt()
        return true
    } catch (e : java.lang.NumberFormatException){
        return false
    }
}