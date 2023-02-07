package leetcode75.lvl2;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        if (n <= 0) return head;

        ListNode iterator = head;
        int size = 1;

        while (iterator.next != null) {
            iterator = iterator.next;
            size++;
        }

        if (n == size) return head.next;

        iterator = head;
        for (int i = 0; i < size - n - 1; i++) {
            iterator = iterator.next;
        }

        iterator.next = iterator.next.next;

        return head;
    }
}
