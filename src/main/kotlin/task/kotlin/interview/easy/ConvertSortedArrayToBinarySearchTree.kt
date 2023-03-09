package task.kotlin.interview.easy

import task.kotlin.structure.TreeNode

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// time: O(n)
// space: O(n)

class ConvertSortedArrayToBinarySearchTree {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return goTraverse(nums, 0, nums.size - 1)
    }

    private fun goTraverse(nums: IntArray, left: Int, right:Int): TreeNode? {
        if (left > right) {
            return null
        }
        val mid = (right + left) / 2
        val curr = TreeNode(nums[mid])
        curr.left = goTraverse(nums, left, mid - 1)
        curr.right = goTraverse(nums, mid + 1, right)
        return curr
    }
}