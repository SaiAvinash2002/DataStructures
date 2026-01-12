fun missingElement(array1: List<Int>, array2: List<Int>): Int {
        if(array1.size<1 || array2.size<1) return  0

        val sum1 = array1.reduce { acc, i ->
            acc + i
        }
        val sum2 = array2.reduce { acc, i ->
            acc + i
        }
        return sum1 - sum2
    }
// Time Complexity: O(n)
// Space Complexity: O(1)
