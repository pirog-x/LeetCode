package task.java.top_interview_questions.medium;

// https://leetcode.com/problems/validate-binary-search-tree/
// time: O(n)
// space: O(1)

import task.java.structure.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return goTraverse(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean goTraverse(TreeNode node, int left, int right) {
        if (node == null) return true;
        if (!(left < node.val && node.val < right)) return false;

        return goTraverse(node.left, left, node.val) &&
               goTraverse(node.right, node.val, right);
    }
}
