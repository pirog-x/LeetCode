package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.MultiplyStrings;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    MultiplyStrings testClass = new MultiplyStrings();

    @Test
    void multiply() {
        String num1 = "123456789";
        String num2 = "987654321";
        String expected = "121932631112635269";
        assertEquals(expected, testClass.multiply(num1, num2));

        num1 = "3";
        num2 = "2";
        expected = "6";
        assertEquals(expected, testClass.multiply(num1, num2));

        num1 = "0";
        num2 = "2";
        expected = "0";
        assertEquals(expected, testClass.multiply(num1, num2));
    }
}