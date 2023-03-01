package task.java.interview.easy;

// https://leetcode.com/problems/climbing-stairs/

// Memorization
// time: O(n)
// space: O(n)

// Bottom-up
// time: O(n)
// space: O(1)

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairsBottomUp(int n) {
        int one = 1;
        int two = 1;
        int tmp;

        for (int i = 0; i < n - 1; i++) {
            tmp = one;
            one += two;
            two = tmp;
        }
        return one;
    }

    public int climbStairs(int n) {
        // bottom-up
        return climbStairsBottomUp(n);
        // memorization
//        cache.clear();
//        return go(0, n);
    }

    private int go(int step, int n) {
        if (step > n) {
            return 0;
        }
        if (step == n) {
            return 1;
        }
        if (cache.containsKey(step)) {
            return cache.get(step);
        }
        cache.put(step, go(step + 1, n) + go(step + 2, n));

        return cache.get(step);
    }
}
