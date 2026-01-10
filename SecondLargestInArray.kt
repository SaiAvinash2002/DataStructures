 // Find the second Largest number from the array.
    fun secondLargest(array: Array<Int>): Int {
        var firstLargest = Integer.MIN_VALUE
        var secondLargest = Integer.MIN_VALUE

        for (i in 0..array.size-1) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest
                firstLargest = array[i]
            } else if (array[i] < firstLargest && array[i] > secondLargest) {
                secondLargest = array[i]
            }
        }
        return secondLargest
    }
