package task.kotlin.interview.easy

import com.sun.source.tree.Tree
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import task.kotlin.structure.TreeNode

class SymmetricTreeTest {

    val testClass: SymmetricTree = SymmetricTree()

    @Test
    fun isSymmetric() {
        // case 1:

        val nlr2 = TreeNode(4)
        val nrr2 = TreeNode(3)

        val nll2 = TreeNode(3)
        val nrl2 = TreeNode(4)

        val nl1 = TreeNode(2, nll2, nrl2)
        val nr1 = TreeNode(2)
        val root = TreeNode(5, nl1, nr1)

        assertTrue(testClass.isSymmetric(root))
    }
}