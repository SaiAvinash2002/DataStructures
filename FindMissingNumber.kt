//  Given an array with elements of n. But it should contain n+1. Find Missing Number?

fun findMissingNumber(list:List<Int>):Int{
    val sum = list.reduce{ accumlator,element ->
        accumlator+element
    }
    return (list.size+2)*(list.size+1 )/2 - sum
}
