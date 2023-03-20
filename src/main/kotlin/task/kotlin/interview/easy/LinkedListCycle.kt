package task.kotlin.interview.easy

import task.kotlin.structure.ListNode

// https://leetcode.com/problems/linked-list-cycle/
// time: O(n)
// space: O(1)

class LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null || head.next == null) return false

        var slow: ListNode? = head
        var fast: ListNode? = head

        while (fast != null) {
            slow = slow?.next
            if (fast.next == null) return true
            fast = fast.next?.next
            if (fast == slow) return true
        }
        return false
    }
}