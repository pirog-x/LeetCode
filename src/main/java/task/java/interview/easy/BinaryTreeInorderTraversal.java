package task.java.interview.easy;

import task.java.structure.TreeNode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-inorder-traversal

// recursive solution:
// time: O(n)
// space: O(n)

/*
    private final List<Integer> solution = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return solution;
        goTraverse(root);
        return solution;
    }

    private void goTraverse(TreeNode node) {
        if (node == null) return;

        goTraverse(node.left);
        solution.add(node.val);
        goTraverse(node.right);
    }
 */

// iterate solution:
// time: O(n)
// space: O(2n)

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode ptr = root;

        while (ptr != null || !stack.isEmpty()) {
            while (ptr != null) {
                stack.push(ptr);
                ptr = ptr.left;
            }
            ptr = stack.pop();
            result.add(ptr.val);
            ptr = ptr.right;
        }

        return result;
    }
}
