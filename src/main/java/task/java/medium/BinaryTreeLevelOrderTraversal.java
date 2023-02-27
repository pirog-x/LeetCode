package task.java.medium;

import task.java.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-level-order-traversal/description/
// time O(n)
// mem: O(n * level)

public class BinaryTreeLevelOrderTraversal {
    private final List<List<Integer>> result = new ArrayList<>();
    private int level = 0;

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        if (result.size() <= level) {
            result.add(new ArrayList<>(List.of(root.val)));
        } else {
            result.get(level).add(root.val);
        }

        level++;
        levelOrder(root.left);
        levelOrder(root.right);
        level--;

        return result;
    }
}
