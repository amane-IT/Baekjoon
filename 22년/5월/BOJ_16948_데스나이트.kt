package `5월`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private val dx = arrayOf(-2, -2, 0, 0, 2, 2)
private val dy = arrayOf(-1, 1, -2, 2, -1, 1)

fun main()= with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val arr = Array<Array<Int>>(n){ Array<Int>(n) {0} }

    val tmp = readLine().split(" ")
    val q: Queue<Array<Int>> = LinkedList<Array<Int>>()
    val visited = Array<Array<Boolean>>(n){Array<Boolean>(n){false} }

    q.add(arrayOf(tmp[0].toInt(), tmp[1].toInt()))
    visited[tmp[0].toInt()][tmp[1].toInt()] = true

    while(!q.isEmpty()){
        val now = q.poll()

        for(i in 0 until dx.size){
            val x = now[0] + dx[i]
            val y = now[1] + dy[i]

            if(x < 0 || x >= n || y < 0 || y >= n)
                continue
            if(visited[x][y])
                continue

            visited[x][y] = true
            arr[x][y] = arr[now[0]][now[1]] + 1
            q.add(arrayOf(x, y))
        }
    }

    if(arr[tmp[2].toInt()][tmp[3].toInt()] == 0){
        println(-1)
    } else{
        println(arr[tmp[2].toInt()][tmp[3].toInt()])
    }

}