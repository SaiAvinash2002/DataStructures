fun removeDuplicatesInSortedArray(nums: IntArray): Int {
        var j = 0 // For tracking the actual array without duplicates.
        for(i in nums.indices){
            if(nums[i]!=nums[j]){  // the index i has found element that is newer one.
                j++
                nums[j] = nums[i]
            }
        }
        return j+1
    }
