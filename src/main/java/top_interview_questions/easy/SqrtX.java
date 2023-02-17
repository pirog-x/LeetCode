package top_interview_questions.easy;

// https://leetcode.com/problems/sqrtx/
// time: O(sqrt(X))
// space: O(1)
/*
        if (x == 0 || x == 1) return x;

        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
*/

// time: O(log(X))
// space: O(1)

public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid < x / mid)
                left = mid + 1;
            else if (mid > x / mid)
                right = mid - 1;
            else
                return mid;
        }
        return right;
    }
}