package task.kotlin.interview.easy

import task.kotlin.structure.TreeNode

// https://leetcode.com/problems/symmetric-tree/
// time: O(n)
// space: O(1)

class SymmetricTree {
    fun isSymmetric(root: TreeNode): Boolean {
        return isMirror(root.left, root.right)
    }

    private fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false

        return left.`val` == right.`val` && isMirror(left.left, right.right) && isMirror(left.right, right.left)
    }
}