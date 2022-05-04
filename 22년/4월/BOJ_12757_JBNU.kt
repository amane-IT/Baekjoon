import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val map = TreeMap<Int, Int>()
    for(i in 0 until n){
        st = StringTokenizer(readLine())
        map.put(st.nextToken().toInt(), st.nextToken().toInt())
    }

    map.put(-1_000_000_001, -1)
    map.put(1_000_000_001, -1)

    map.toSortedMap()

    for(i in 0 until m){
        st = StringTokenizer(readLine())
        val order = st.nextToken().toInt()
        when(order){
            1 -> {
                map.put(st.nextToken().toInt(), st.nextToken().toInt())
            }
            2 -> {
                val ord = st.nextToken().toInt()
                val key = findKey(ord, map, k)

                if(key == -2 && key == -1)
                    continue

                map.put(key, st.nextToken().toInt())
            }
            3 -> {
                val ord = st.nextToken().toInt()
                val key = findKey(ord, map, k)
                if(key == -2)
                    println("?")
                else if(map.get(key) == null)
                    println(-1)
                else
                    println(map.get(key))

            }
        }
    }
}

private fun findKey(key: Int, map: TreeMap<Int, Int>, k: Int): Int{
    val right = map.ceilingKey(key)
    val left = map.floorKey(key)
//
//    if(right == -1)
//        return -1

    if(map.get(right) == map.get(left)){
        return right
    }
    else if(right - key < key - left && k >= right - key)
        return right
    else if(right - key > key - left && k >= key - left)
        return left
    else if(right - key == key - left && k >= right - key)
        return -2
    else
        return -1
}