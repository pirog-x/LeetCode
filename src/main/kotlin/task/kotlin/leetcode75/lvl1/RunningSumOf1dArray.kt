package task.kotlin.leetcode75.lvl1

// https://leetcode.com/problems/running-sum-of-1d-array
// time: O(n)
// space: O(1)

class RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        if (nums.isEmpty()) return nums

        var sumOfPrev = nums[0]
        for (i in 1 until nums.size) {
            nums[i] += sumOfPrev
            sumOfPrev = nums[i]
        }
        return nums
    }
}