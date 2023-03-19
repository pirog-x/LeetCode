package task.kotlin.interview.easy

// https://leetcode.com/problems/single-number/
// time: O(n)
// space: O(1)

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]

        var result = 0
        for (i in nums) {
            result = i xor result
        }
        return result
    }
}