package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    SortList testClass = new SortList();

    @Test
    void sortList() {
        ListNode n4 = new ListNode(0);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(5, n2);
        ListNode head = new ListNode(-1, n1);

        testClass.sortList(head);
        testSorting(head);
    }

    private void testSorting(ListNode testHead) {
        ListNode n4 = new ListNode(5);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(0, n2);
        ListNode head = new ListNode(-1, n1);

        ListNode expected = head;
        ListNode actual = testHead;

        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}