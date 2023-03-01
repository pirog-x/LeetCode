package top_interview_questions.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import task.java.structure.TreeNode;
import task.java.interview.easy.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class BinaryTreeInorderTraversalTest {

    BinaryTreeInorderTraversal testClass = new BinaryTreeInorderTraversal();

    @Test
    void inorderTraversalCaseOne() {
        TreeNode n2 = new TreeNode(3);
        TreeNode n1 = new TreeNode(2, n2, null);
        TreeNode root = new TreeNode(1, null, n1);

        List<Integer> expected = Arrays.asList(1, 3, 2);
        Assertions.assertThat(testClass.inorderTraversal(root)).isEqualTo(expected);
    }

    @Test
    void inorderTraversalCaseTwo() {

        TreeNode root = null;

        List<Integer> expected = new ArrayList<>();
        Assertions.assertThat(testClass.inorderTraversal(root)).isEqualTo(expected);
    }

    @Test
    void inorderTraversalCaseThree() {

        TreeNode root = new TreeNode(1);

        List<Integer> expected = Arrays.asList(1);
        Assertions.assertThat(testClass.inorderTraversal(root)).isEqualTo(expected);
    }
}