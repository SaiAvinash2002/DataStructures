
fun selectionSort(array: Array<Int>) {
   for (i in 0 until array.size-1) {
       var minIndex = i
       for (j in i+1 until array.size) {
           if (array[j] < array[minIndex]) {
               minIndex = j
           }
       }
       if (minIndex != i) {
           val tem = array[minIndex]
           array[minIndex] = array[i]
           array[i] = tem
       }
   }
}
