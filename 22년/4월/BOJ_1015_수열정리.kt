import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val num = readLine().split(" ")
    val A: Array<Array<Int>> = Array(n){Array(2){0} }
    for(i in 0 until n){
        A[i] = arrayOf( num[i].toInt(), i)
    }

    val B = Array<Int>(n){0}

    for(i in 0 until n){
        var minIdx = 0

        for(j in 1 until n){
            if(A[minIdx][0] > A[j][0]){
                minIdx = j
            }
        }

        B[i] = minIdx
        A[minIdx][0] = 1001
    }

    for(i in 0 until n){
        for(j in 0 until n){
            if(A[i][1] == B[j])
                print("$j ")
        }
    }
}

