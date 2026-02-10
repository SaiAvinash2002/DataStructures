 fun longestCommonPrefix(strs: Array<String>): String {

        if(strs.isEmpty()) return ""

        for(i in 0..strs[0].length-1){
            for(j in 1..strs.size-1){
                if(i>=strs[j].length || strs[0][i]!=strs[j][i])
                    return strs[0].substring(0,i)
            }
        }
    return strs[0] // this satisfies for if the length is 1 or the entire string is commonPrefix
    }
