package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.TaskScheduler;

import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {

    TaskScheduler testClass = new TaskScheduler();

    @Test
    void leastInterval() {
        char[] task = new char[] { 'A','A','A','B','B','B' };
        int n = 2;
        int expected = 8;

        assertEquals(expected, testClass.leastInterval(task, n));

        task = new char[] { 'A','A','A','B','B','B' };
        n = 0;
        expected = 6;

        assertEquals(expected, testClass.leastInterval(task, n));

        task = new char[] { 'A','A','A','A','A','A','B','C','D','E','F','G' };
        n = 2;
        expected = 16;

        assertEquals(expected, testClass.leastInterval(task, n));
    }
}