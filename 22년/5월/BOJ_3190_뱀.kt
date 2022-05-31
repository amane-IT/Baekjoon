import java.io.BufferedReader
import java.io.InputStreamReader


private var n = 0
private var l = 0
private var k = 0
private val dx = arrayOf(0, 1, 0, -1)
private val dy = arrayOf(1, 0, -1, 0)
private lateinit var map: Array<Array<Int>>
private val snake = mutableListOf<Array<Int>>()

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    snake.add(arrayOf(0, 0))

    n = readLine().toInt()
    map = Array(n){Array(n) {0}}

    k = readLine().toInt()
    for(i in 0 until k){
        val st = readLine().split(" ")
        map[st[0].toInt() - 1][st[1].toInt() - 1] = 1
    }

    l = readLine().toInt()
    val dir = Array(l){Array<Int>(2){0} }
    for(i in 0 until l){
        val st = readLine().split(" ")
        dir[i][0] = st[0].toInt()
        dir[i][1] = if(st[1] == "L") -1 else 1
    }

    countTime(0, 0, 0, dir)

}

private fun countTime(x: Int, y: Int, dir: Int, dirs: Array<Array<Int>>){
    var time = 0
    var turn = 0
    var x = x
    var y = y
    var dir = dir

    while(true){
        time++
        val nextX = x + dx[dir]
        val nextY = y + dy[dir]

        if(!isRange(nextX, nextY))
            break

        if(map[nextX][nextY] == 1){
            snake.add(arrayOf(nextX, nextY))
            map[nextX][nextY] = 0
        } else{
            snake.add(arrayOf(nextX, nextY))
            snake.removeAt(0)
        }

        x = nextX
        y = nextY

        if(turn < l){
            if(time == dirs[turn][0]){
                val next = ( dir + dirs[turn][1] ) % 4
                dir = if(next == -1) 3 else next
                turn++
            }
        }
    }
    println(time)
}

fun isRange(nextX: Int, nextY: Int): Boolean {
    if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= n)
        return false

    for(i in 0 until snake.size){
        if( snake[i][0] == nextX && snake[i][1] == nextY)
            return false
    }
    return true
}
