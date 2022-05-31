import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max
import java.util.Queue

private var r = 0
private var c = 0
private lateinit var map: Array<Array<Char>>
private lateinit var visited: Array<Boolean>
private lateinit var check: Array<Array<Boolean>>
private val dx = arrayOf(1, 0, -1, 0)
private val dy = arrayOf(0, 1, 0, -1)

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = readLine().split(" ")
    r = st[0].toInt()
    c = st[1].toInt()

    map = Array(r){Array<Char>(c){'a'} }
    check = Array(r){Array<Boolean>(c){ false } }
    visited = Array(26){false}

    for(i in 0 until r){
        val st = readLine().toCharArray()
        for(j in 0 until c){
            map[i][j] = st[j]
        }
    }

//    bfs()
    visited[map[0][0] - 'A'] = true
    check[0][0] = true
    dfs(0, 0, 1)

    print(max)
}

private var max = 0
private fun dfs(x: Int, y: Int, depth: Int){

    for(i in 0 until 4){
        var newX = x + dx[i]
        var newY = y + dy[i]

        if(newX < 0 || newX >= r
                || newY < 0 || newY >= c
                || check[newX][newY])
            continue

        if(visited[map[newX][newY] - 'A'])
            continue

        check[newX][newY] = true
        visited[map[newX][newY] - 'A'] = true
        dfs(newX, newY, depth + 1)
        visited[map[newX][newY] - 'A'] = false
        check[newX][newY] = false
    }

    max = max(max, depth)
}