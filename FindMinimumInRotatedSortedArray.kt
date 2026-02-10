fun findMin(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        var mid = 0
        var minValue = Integer.MAX_VALUE
        while(start<=end){
            mid = (start + end)/2
            if(nums[start]<=nums[mid]){
                if(nums[start]<minValue)
                   minValue = nums[start]
                start = mid +1
            }
            else{
                if(nums[mid]<=minValue)
                    minValue = nums[mid]
                end = mid - 1
            }
        }

        return minValue
    }
