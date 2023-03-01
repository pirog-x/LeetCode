package task.java.interview.easy;

// https://leetcode.com/problems/plus-one/
// time: O(n)
// space: O(n)

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        List<Integer> list = new ArrayList<>(digits.length + 1);
        for (int i = digits.length - 1; i >= 0; i--) list.add(digits[i]);

        int one = 1;
        int i = 0;

        while (one != 0) {
            if (i < list.size()) {
                if (list.get(i) == 9) {
                    list.set(i, 0);
                } else {
                    list.set(i, list.get(i) + 1);
                    one = 0;
                }
            } else {
                list.add(1);
                one = 0;
            }
            i += 1;
        }


        int[] tmp = new int[list.size()];
        for (int j = list.size() - 1, k = 0; j >= 0; j--) tmp[k++] = list.get(j);
        return tmp;
    }
}
