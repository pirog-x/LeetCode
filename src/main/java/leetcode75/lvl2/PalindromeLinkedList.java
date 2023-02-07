package leetcode75.lvl2;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        // speed: O(n)
        // memory: O(1)

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse list
        ListNode tmp;
        ListNode prev = null;

        while(slow != null) {
            tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }

        // compare
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
