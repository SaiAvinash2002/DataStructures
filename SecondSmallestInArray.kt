 // Find the second smallest number from the array.
    fun secondSmallest(array: Array<Int>): Int {
        var firstSmallest = Integer.MAX_VALUE
        var secondSmallest = Integer.MAX_VALUE

        for (i in 0..array.size) {
            if (array[i] < firstSmallest) {
                secondSmallest = firstSmallest
                firstSmallest = array[i]
            } else if (array[i] > firstSmallest && array[i] < secondSmallest) {
                secondSmallest = array[i]
            }
        }
        return secondSmallest
    }
