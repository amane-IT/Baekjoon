package LG

fun solution(rid: String): String {
    var answer: String = ""

    var year = rid.substring(0, 2)
    var gender = rid.substring(7, 8).toInt()

    when(gender){
        1 -> answer = "19${year}/M"
        2 -> answer = "19${year}/F"
        3 -> answer = "20${year}/M"
        4 -> answer = "20${year}/F"
    }

    return answer
}