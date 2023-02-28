package task.kotlin.leetcode75.lvl1

class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var check = 0
        val arraySum: Int = nums.sum()

        for (i in nums.indices) {
            if (arraySum - nums[i] - check == check) return i
            check += nums[i]
        }

        return -1
    }
}
