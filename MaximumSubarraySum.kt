// Find the contiguous subarray which has the maximum sum.
// [-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Maximum Sum = 6
// Subarray = [4, -1, 2, 1]

fun maximumSubarraySum(list:List<Int>):Int{
    var maximumSum = Integer.MIN_VALUE
    var temporarySum = 0
    var start = 0
    var end = 0
    
    for(i in 0 until list.size){
        temporarySum = temporarySum + list[i]
        if(maximumSum < temporarySum) {
        	maximumSum = temporarySum
            end = i
        }
        if(temporarySum<0){
        	temporarySum = 0
            start = i+1 
        }
    }
    return maximumSum
}
