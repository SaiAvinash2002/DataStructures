/**
Check if a Given String is Palindrome or not without finding the reverse of the string.
 **/

fun checkPalindrome(): String{
    val input = "abcba"
    val n = input.length
    for (i in 0 until n){
        if (input[i]!=input[input.length-1-i]){
            return "not a palindrome"
        }
    }
    return "palindrome"
}
fun main() {
    print(checkPalindrome())
}

/*
 * Count the number of occurrences of each char in the input string.
 */

fun countOccurrences(input:String):Map<Char,Int>{
    val count=mutableMapOf<Char,Int>()
    for (i in input)
    {
     	if (i in count){
            count[i] = count[i]!!+1
        }
        else{
            count[i]=1
        }
    }
    
    return count
}



/*
Find the most recurring char in the input string.
*/
fun findRecurring(input:String): Char {
    var count =mutableMapOf<Char, Int>()
    var mostRecurringCount =0
    var char : Char = ' '
   for (i in input){
       if (i in count){
           count[i] = count[i]!!+1
           if (mostRecurringCount<count[i]!!)
               char = i
       }
       else
           count[i] = 1
   }
   return char
}


/*
Remove duplicate chars from the input string.
*/
fun removeDuplicate(input:String): String {
   var result=""
   var count = mutableListOf<Char>()
   input.forEach {  i ->
       if (i !in count) {
           result += i
           count.add(i)
       }
   }
   return result
}


/*
Print all the duplicate chars in the input string.
*/


fun findDuplicates(input:String): String {
   var list = mutableListOf<Char>()
   var result = ""
   input.forEach {  i ->
       if (i in list) result +=i
       else list.add(i)
   }
   return result
}


/*
Find first non-repeating character in the string.
*/
fun firstNonRepeating(input:String): Char {
   var count = mutableMapOf<Char,Int>()
   input.forEach { i->
       if (i in count)  count[i] = count[i]!! +1
       else count[i] = 1
   }
   count.forEach { (ch, i) ->
      if (i==1) return ch
   }
   return ' '
}


/*
Remove characters from the first string which are present in the second string
*/
fun removeCharacters(input1:String, input2:String): String {
   var count = mutableListOf<Char>()
   input2.forEach {  i->
       if (i !in count)
           count.add(i)
    }


   var result = ""
   input1.forEach { i->
       if (i !in count )    result += i
   }
   return result
}


/*
Check if strings are rotations of each other or not
*/
fun checkRotations(input1:String, input2:String): Boolean {
   val tem =input1 + input1
   return input2 in tem
}


/*
Check whether two strings are anagram of each other.
*/
fun checkAnagram(input1: String,input2: String): Boolean {
   if (input2.length!=input1.length)   return false
   var count1 = mutableMapOf<Char, Int>()
   var count2 = mutableMapOf<Char,Int>()
   input1.forEach {
       char-> count1[char] = count1.getOrDefault(char,0)+1
   }
   input2.forEach {
       char-> count2[char] = count2.getOrDefault(char,0)+1
   }
   return count2 == count1
}


/* DOUBT
Find the length of the longest common prefix (LeetCode). You are given two arrays with positive integers arr1 and arr2.
A prefix of a positive integer is an integer formed by one or more of its digits, starting from its leftmost digit. 
For example, 123 is a prefix of the integer 12345, while 234 is not. A common prefix of two integers a and b is an integer c,
such that c is a prefix of both a and b. For example, 5655359 and 56554 have common prefixes 565 and 5655 while 1223 and 43456 do not have a common prefix. 
You need to find the length of the longest common prefix between all pairs of integers (x, y) such that x belongs to arr1 and y belongs to arr2. 
Return the length of the longest common prefix among all pairs. If no common prefix exists among them, return 0. 
*/
fun longestCommonPrefix(arr1: IntArray, arr2: IntArray): Int {
   var count = HashSet<String>()
   for (i in arr1){
       var s = i.toString()
       var prefix = ""
       for (char in s){
           prefix +=char
           if (prefix !in count)   count.add(prefix)
       }
   }
   var longestPrefix = 0
   for (i in arr2){
       var s = i.toString()
       var prefix = ""
       for (char in s){
           prefix +=char
           if (prefix in count)   longestPrefix = max(longestPrefix,prefix.length)
       }
   }
   return longestPrefix
}



class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size ==1)  return strs[0]


        val firstElement = strs[0]
        var res = ""
        for (i in 0 until firstElement.length){
            for (elementIndex in 1 until strs.size){
                if (i>=strs[elementIndex].length || strs[elementIndex][i]!=firstElement[i]){
                    return res
                }
            }
            res +=firstElement[i]
        }
    return res
    }
}

/**
Move all zeros to the end of an array while maintaining the order of non-zero elements.
 **/
 if (nums.size<2) return
        // len > 2
        var first = 0
        var second =1


        while(second<nums.size){
            if (nums[first]==0 && nums[second]!=0){
                val tem = nums[first]
                nums[first] = nums[second]
                nums[second] = tem
                first++
                second++
            }
            else if(nums[first]==0 && nums[second]==0){
                second++
            }
            else{
                 first++
                second++
            }
        }


/*
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than
    ⌊n / 2⌋ times. You may assume that the majority element always  
    exists in the array.
     */
    fun majorityElement(nums: IntArray): Int {
       var major = -1
       var count =0
       nums.forEach{
            value ->
            if (count==0){
                major = value
            }
            if (major==value){
                count++
            }
            else{
                count--
            }
       }
       return major
    }
