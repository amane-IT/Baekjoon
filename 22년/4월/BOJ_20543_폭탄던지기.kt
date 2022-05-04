import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = readLine().split(" ").map { it.toInt() }.toIntArray()
    val n = st[0]
    val m = st[1]

    val map = Array<Array<Long>>(2001){Array<Long>(2001){0}}
    val ans = Array<Array<Long>>(2001){Array<Long>(2001){0}}

    for(i in 0 until n){
        val tmp = readLine().split(" ").map { it.toLong() * -1 }.toLongArray()
        for(j in 0 until n){
            map[i][j] = tmp[j]
        }
    }

    if(m == 1) {
        for (i in 0 until n){
            for (j in 0 until n) {
                print("${map[i][j]}")
            }
            println()
        }
        return@with
    }


    for(i in 0 until n){
        for(j in 0 until n){

            val x = if(i + m / 2 < n) i + m / 2 else n - 1
            val y = if(j + m / 2 < n) j + m / 2 else n - 1
            val x2 = if(i - m / 2 - 1 >= 0) i - m / 2 - 1 else 0
            val y2 = if(j - m / 2 - 1 >= 0) j - m / 2 - 1 else 0

            if(x >= n || y >= n)
                continue

            ans[x][y] = ans[x - 1][y] + ans[x][y - 1] - ans[x - 1][y - 1]

            val new = -1 * ((ans[x][y] - ans[x][y2] - ans[x2][y] + ans[x2][y2]) + map[i][j])
            ans[x][y] += new
            print("${ans[x][y]} ")

        }
        println()
    }

    val sb = StringBuffer()
    for(i in 0 until n){
        for(j in 0 until n){

            val x = if(i - 1 >= 0) i - 1 else 0
            val y = if(j - 1 >= 0) j - 1 else 0
            val bomb = ans[i][j] - ans[x][j] - ans[i][y] + ans[x][y]
            sb.append(bomb * -1).append(" ")
        }
        sb.append("\n")
    }

    println(sb.toString())
}