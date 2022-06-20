fun main(){
    val clothes: Array<Array<String>> = arrayOf(arrayOf("yellowhat", "headgear"),
    arrayOf("bluesunglasses", "eyewear"), arrayOf("green_turban", "headgear")
    )

    println(solution(clothes))

}
fun solution(clothes: Array<Array<String>>): Int {
    var answer = 1

    val map = mutableMapOf<String, Int>()

    for(i in 0 until clothes.size){
        map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1)
    }

    for(st in map.keys){
        answer *= map.get(st)!! + 1
    }

    return answer - 1
}