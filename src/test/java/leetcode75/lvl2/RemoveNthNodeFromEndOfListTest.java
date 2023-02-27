package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.RemoveNthNodeFromEndOfList;
import task.java.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList testClass = new RemoveNthNodeFromEndOfList();

    @Test
    void removeNthFromEnd() {
        ListNode n5 = new ListNode(6, null);
        ListNode n4 = new ListNode(5, n5);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode head = new ListNode(1, n1);

        int n = 2;
        ListNode iterator = testClass.removeNthFromEnd(head, n);

        boolean isEquals = false;
        for (int i = 1; i <= 6; i++) {
            if (i == 5) continue;
            if (iterator.val != i) {
                assertTrue(isEquals);
            }
            iterator = iterator.next;
        }
        if (iterator == null) isEquals = true;

        assertTrue(isEquals);
    }

    @Test
    void cunningCase() {
        ListNode n1 = new ListNode(2, null);
        ListNode head = new ListNode(1, n1);
        int n = 2;

        ListNode iterator = testClass.removeNthFromEnd(head, n);

        boolean isEquals = false;
        for (int i = 1; i <= 2; i++) {
            if (i == 1) continue;
            if (iterator.val != i) {
                assertTrue(isEquals);
            }
            iterator = iterator.next;
        }
        if (iterator == null) isEquals = true;

        assertTrue(isEquals);
    }
}