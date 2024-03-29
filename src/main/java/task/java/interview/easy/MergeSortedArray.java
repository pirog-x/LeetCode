package task.java.interview.easy;

// https://leetcode.com/problems/merge-sorted-array/
// time: O(n)
// space: O(1)

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int last = m + n - 1;

        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[last] = nums1[ptr1--];
            } else {
                nums1[last] = nums2[ptr2--];
            }
            last--;
        }

        while (ptr2 >= 0) nums1[last--] = nums2[ptr2--];
    }
}
