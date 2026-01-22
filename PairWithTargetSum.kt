 fun pairWithTargetSum(array:List<Int>, target:Int): Pair<Int,Int>{
        val numbersComplement = HashSet<Int>()

        for (i in 0 until array.size){
            if(numbersComplement.contains(array[i])){
                return Pair(array[i],target-array[i])
            }
            numbersComplement.add(target-array[i])
        }

        return Pair(-1,-1)
    }
