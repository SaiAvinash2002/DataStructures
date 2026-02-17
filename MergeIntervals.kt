fun MergeIntervals (intervals: Array<IntArray>): Array<IntArray> {
        var result = arrayOf<IntArray>()
        intervals.sortBy { it[0] }
        var start = intervals[0][0]
        var end = intervals[0][1] 

        for(i in 1 until intervals.size){
            if(end>=intervals[i][0]){
                end = max(end,intervals[i][1])
            }
            else{
                result = result + intArrayOf(start,end)
                start = intervals[i][0]
                end = intervals[i][1] 
            }
        }
            result = result + intArrayOf(start,end)

        return result
}
