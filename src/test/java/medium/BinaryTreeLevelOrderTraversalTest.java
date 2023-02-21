package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import structure.TreeNode;

import java.util.Arrays;
import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal testClass = new BinaryTreeLevelOrderTraversal();

    @Test
    void levelOrder() {
        // [3,9,20,null,null,15,7]
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);

        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20, left2, right2);

        TreeNode root = new TreeNode(3, left1, right1);
        List<List<Integer>> result = testClass.levelOrder(root);

        //[[3],[9,20],[15,7]]
        List<List<Integer>> expected = Arrays.asList(List.of(3), List.of(9, 20), List.of(15, 7));

        Assertions.assertThat(result).isEqualTo(expected);
    }
}