fun validSudoko(sudokoList: List<List<String>>): Boolean {
        val rowsHashSet = Array(9) { HashSet<String>(9) }
        val columnsHashSet = Array(9) { HashSet<String>(9) }
        val blockHashSet = Array(3) {
            Array(3) {
                HashSet<String>(9)
            }
        }


        for (row in 0..8) {
            for (col in 0..8) {
                if (sudokoList[row][col] == ".") {
                    continue
                }
                if (rowsHashSet[row].contains(sudokoList[row][col]) || columnsHashSet[col].contains(
                        sudokoList[row][col]
                    ) || blockHashSet[(row / 3)][(col / 3)].contains(sudokoList[row][col])
                ) {
                    return false
                }
                rowsHashSet[row].add(sudokoList[row][col])
                columnsHashSet[col].add(sudokoList[row][col])
                blockHashSet[(row / 3)][(col / 3)].add(sudokoList[row][col])
            }
        }
        return true
    }

    // Space: O(27)
    // Time: O(81)
