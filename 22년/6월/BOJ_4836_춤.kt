import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var str = readLine()
    while(!str.isNullOrEmpty()){

        val tmp = str.split(" ")
        val check = BooleanArray(tmp.size){false}
        val error = mutableListOf<Int>()

        var flag = false
        for(i in 0 until tmp.size){
            if(tmp[i] == "dip"){
                if(!((i - 1 >= 0 && "jiggle" == tmp[i - 1])
                            || (i - 2 >= 0 && "jiggle" == tmp[i - 2])
                            || (i + 1 < tmp.size && "twirl" == tmp[i + 1]))){
                    check[i] = true
                    flag = true
                }
            }
        }
        if(flag)
            error.add(1)


        if(!(tmp.size >= 3 && tmp[tmp.size - 3] == "clap"
            && tmp[tmp.size - 2] == "stomp"
            && tmp[tmp.size - 1] == "clap")){
            error.add(2)
        }

        if(tmp.contains("twirl")){
            if(!tmp.contains("hop")){
                error.add(3)
            }
        }

        if(tmp[0] == "jiggle"){
            error.add(4)
        }

        if(!tmp.contains("dip")){
            error.add(5)
        }

        if(error.size == 0)
            println("form ok: $str")
        else if(error.size == 1){
            var s = ""
            for(i in 0 until tmp.size){
                if(check[i]){
                    s += " " + tmp[i].toUpperCase()
                } else
                    s += " ${tmp[i]}"
            }
            println("form error ${error[0]}:$s")
        }
        else{
            var ans = ""
            for(i in 0 until error.size){
                if(i == error.size - 1)
                    ans += " and ${error[i]}"
                else if(i == 0)
                    ans += "${error[i]}"
                else
                    ans += ", ${error[i]}"
            }

            var s = ""
            for(i in 0 until tmp.size){
                if(check[i]){
                    s += " " + tmp[i].uppercase()
                } else
                    s += " ${tmp[i]}"
            }

            println("form errors $ans:$s")
        }
        str = readLine()
    }
}