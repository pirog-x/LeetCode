package top_interview_questions.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MergeSortedArrayTest {

    MergeSortedArray testClass = new MergeSortedArray();

    @Test
    void merge() {
        int[] nums1 = new int[] { 1,2,3,0,0,0 };
        int[] nums2 = new int[] { 2,5,6 };

        int m = 3;
        int n = 3;

        int[] expected = new int[] { 1,2,2,3,5,6 };
        testClass.merge(nums1, m, nums2, n);
        Assertions.assertThat(nums1).isEqualTo(expected);

        nums1 = new int[] {-1,0,0,0,3,  0,0,0,0,0,0};
        nums2 = new int[] { -1,-1,0,0,1,2 };
        m = 5;
        n = 6;


        expected = new int[] {-1,-1,-1,0,0,0,0,0,1,2,3};
        testClass.merge(nums1, m, nums2, n);
        Assertions.assertThat(nums1).isEqualTo(expected);


        nums1 = new int[] {0};
        nums2 = new int[] {2};
        m = 0;
        n = 1;


        expected = new int[] {2};
        testClass.merge(nums1, m, nums2, n);
        Assertions.assertThat(nums1).isEqualTo(expected);
    }
}