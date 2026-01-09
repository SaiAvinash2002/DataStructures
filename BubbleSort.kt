fun bubbleSort(array: Array<Int>) {
   for (i in 0 until array.size - 1) {
       for (j in i + 1 until array.size - i - 1) {
           if (array[j] > array[j + 1]) {
               val tem = array[j]
               array[j] = array[j + 1]
               array[j + 1] = tem
           }
       }
   }
}
