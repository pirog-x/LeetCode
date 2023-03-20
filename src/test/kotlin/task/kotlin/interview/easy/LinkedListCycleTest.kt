package task.kotlin.interview.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import task.kotlin.structure.ListNode

class LinkedListCycleTest {

    val testClass = LinkedListCycle()

    @Test
    fun hasCycle() {
        val n3 = ListNode(-4)
        val n2 = ListNode(0, n3)
        val n1 = ListNode(2, n2)
        val root = ListNode(3, n1)
        n3.next = n1

        assertTrue(testClass.hasCycle(root))
    }
}