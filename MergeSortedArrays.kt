fun mergeSortedArrays(array1: List<Int>, array2: List<Int>): MutableList<Int> {
        val array3 = mutableListOf<Int>()
        var i = 0
        var j = 0
        while (i < array1.size && j < array2.size) {
            if (array1[i] <= array2[j]) {
                array3.add(array1[i])
                i++
            } else {
                array3.add(array2[j])
                j++
            }
        }

        if (i != array1.size) {
            for (index in i until array1.size) {
                array3.add(array1[index])
            }
        }

        if (j != array2.size) {
            for (index in j until array2.size) {
                array3.add(array2[index])
            }
        }
        return array3
    }
