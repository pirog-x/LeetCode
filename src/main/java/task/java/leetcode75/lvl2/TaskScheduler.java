package task.java.leetcode75.lvl2;

// https://leetcode.com/problems/task-scheduler/?envType=study-plan&id=level-2
// time: O(n * log(n))
// space: O(1)

import java.util.*;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        int[] charMap = new int[26];
        for (char c : tasks) {
            charMap[c - 'A']++;
        }
        Arrays.sort(charMap);

        int maxVal = charMap[25] - 1;
        int idleSlots = maxVal * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(charMap[i], maxVal);
        }

        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}
