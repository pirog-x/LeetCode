package leetcode75.lvl2;

// https://leetcode.com/problems/happy-number/?envType=study-plan&id=level-2


import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;

public class HappyNumber {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> cache = new HashMap<>();

        while (!cache.containsKey(n)) {
            cache.put(n, true);
            n = sumOfSquares(n);
            if (n == 1) return true;
        }
        return false;
    }

    private int sumOfSquares(int n) {
        StringBuilder numStorage = new StringBuilder();

        while(n > 0) {
            numStorage.insert(0, n %10);
            n = n / 10;
        }

        for (int i = 0; i < numStorage.length(); i++) {
            n += pow(Character.getNumericValue(numStorage.charAt(i)), 2);
        }
        return n;
    }
}
