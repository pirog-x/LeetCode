package top_interview_questions.medium;

import org.junit.jupiter.api.Test;
import task.java.structure.TreeNode;
import task.java.top_interview_questions.medium.ValidateBinarySearchTree;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree testClass = new ValidateBinarySearchTree();

    @Test
    void isValidBST() {
        // case 1
        TreeNode nl = new TreeNode(1);
        TreeNode nr = new TreeNode(3);
        TreeNode root = new TreeNode(2, nl, nr);

        assertTrue(testClass.isValidBST(root));
    }

    @Test
    void isNotValidBST() {
        // case 1
        TreeNode nl1 = new TreeNode(1);
        TreeNode nl2 = new TreeNode(3);
        TreeNode nr2 = new TreeNode(6);
        TreeNode nr1 = new TreeNode(4, nl2, nr2);
        TreeNode root = new TreeNode(5, nl1, nr1);

        assertFalse(testClass.isValidBST(root));

        // case 2
        TreeNode nl = new TreeNode(2);
        TreeNode nr = new TreeNode(2);
        root = new TreeNode(2, nl, nr);
        assertFalse(testClass.isValidBST(root));


        // case 3
        nl1 = new TreeNode(3);
        nl2 = new TreeNode(4);
        nr2 = new TreeNode(8);
        nr1 = new TreeNode(7, nl2, nr2);

        root = new TreeNode(5, nl1, nr1);

        assertFalse(testClass.isValidBST(root));
    }
}