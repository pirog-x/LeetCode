package task.kotlin.interview.easy

import task.kotlin.structure.TreeNode

// https://leetcode.com/problems/maximum-depth-of-binary-tree
// time: O(n)
// space: O(n)

class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        return goTraverse(root, 0)
    }

    fun goTraverse(root: TreeNode?, level: Int): Int {
        if (root == null) {
            return level
        }
        return Math.max(goTraverse(root.left, level + 1), goTraverse(root.right, level + 1))
    }
}