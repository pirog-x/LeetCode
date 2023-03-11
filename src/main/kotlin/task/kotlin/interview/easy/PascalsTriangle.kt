package task.kotlin.interview.easy

// https://leetcode.com/problems/pascals-triangle/
// n = numRows
// time: O((n * (n - 1)) / 2)  => n^2
// space: O((n * (n - 1)) / 2) => n^2

class PascalsTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 1) return mutableListOf(mutableListOf(1))

        val triangle: MutableList<MutableList<Int>> = mutableListOf(mutableListOf(1), mutableListOf(1,1))

        for (i in 2..numRows - 1) {
            triangle.add(ArrayList(i + 1))
            for(j in 0..i) {
                if (j == 0 || j == i) {
                    triangle[i].add(1)
                } else {
                    triangle[i].add(triangle[i - 1][j] + triangle[i - 1][j - 1])
                }
            }
        }
        return triangle
    }
}