    // Merge two arrays to form a third array
    // e.g.
    // First array: 10, 50, 20, 30, 70, 80, 40
    // Second array: 25, 75, 5, 25
    // Merged array should be: 10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40
fun mergeUnsortedArrays(array1: List<Int>, array2: List<Int>): MutableList<Int> {
        val array3 = mutableListOf<Int>()
        var j = 0
        var k = 0
        while (j < array1.size || k < array2.size) {
            if (j < array1.size) {
                array3.add(array1[j])
                j++
            }
            if (k < array2.size) {
                array3.add(array2[k])
                k++
            }
        }
        return array3
}
