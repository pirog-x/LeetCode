package leetcode75.lvl2;

// https://leetcode.com/problems/odd-even-linked-list/?envType=study-plan&id=level-2

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode tail = head;
        int size = 1;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        ListNode ptr = head;
        int counter = 1;

        while (counter < size) {
            tail.next = ptr.next;
            tail = tail.next;
            ptr.next = ptr.next.next;
            ptr = ptr.next;
            tail.next = null;
            counter += 2;
        }

        return head;
    }
}