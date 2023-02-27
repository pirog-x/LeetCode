package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.OddEvenLinkedList;
import task.java.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {

    OddEvenLinkedList testClass = new OddEvenLinkedList();

    @Test
    void oddEvenListCase1() {
        // Input: head = [2,1,3,5,6,4,7]
        ListNode n5 = new ListNode(7, null);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(6, n4);
        ListNode n2 = new ListNode(5, n3);
        ListNode n1 = new ListNode(3, n2);
        ListNode n0 = new ListNode(1, n1);
        ListNode head = new ListNode(2, n0);

        testClass.oddEvenList(head);
        checkCorrectCase1(head);
    }

    private void checkCorrectCase1(ListNode testHead) {
        // Output: [2,3,6,7,1,5,4]
        ListNode n5 = new ListNode(4, null);
        ListNode n4 = new ListNode(5, n5);
        ListNode n3 = new ListNode(1, n4);
        ListNode n2 = new ListNode(7, n3);
        ListNode n1 = new ListNode(6, n2);
        ListNode n0 = new ListNode(3, n1);
        ListNode head = new ListNode(2, n0);

        ListNode expected = head;
        ListNode but = testHead;

        StringBuilder msg = new StringBuilder();

        while (expected != null && but != null) {
            assertEquals(expected.val, but.val, "in list: " + msg);

            msg.append(expected.val).append(", ");
            expected = expected.next;
            but = but.next;
        }
    }
}
