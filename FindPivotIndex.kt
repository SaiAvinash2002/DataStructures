fun pivotIndex(nums: IntArray): Int {
        var sum = 0
        nums.forEach{
            sum+=it
        }

        var leftSum =0
        var rightSum = sum
        for(i in 0..nums.size-1){
            rightSum = rightSum - nums[i]
            if(rightSum == leftSum)    return i
            leftSum = leftSum + nums[i]
        }
        return -1
    }
