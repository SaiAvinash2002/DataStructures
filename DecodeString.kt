fun decodeString(input: String): String {
        if (input.isEmpty()) return ""
        var result = ""
        var tempCount = 1
        var i = 1
        while (i <= input.length - 1) {
            if (input[i] == input[i - 1]) {
                tempCount++
            } else {
                result += input[i - 1] + tempCount.toString()
                tempCount = 1
            }

            i++
        }
        return result + input[i - 1] + tempCount.toString()
    }
