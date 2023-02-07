package leetcode75.lvl2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    PalindromeLinkedList testClass = new PalindromeLinkedList();

    @Test
    void isPalindrome() {
        ListNode n3 = new ListNode(1);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode head = new ListNode(1, n1);

        assertTrue(testClass.isPalindrome(head));
    }

    @Test
    void isNotPalindrome() {
        ListNode n1 = new ListNode(2);
        ListNode head = new ListNode(1, n1);

        assertFalse(testClass.isPalindrome(head));
    }
}