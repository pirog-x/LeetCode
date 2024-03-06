package task.java.leetcode75.lvl1;

import static java.lang.Math.min;

/*
 * https://leetcode.com/problems/greatest-common-divisor-of-strings
 */

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1;
        }
        int len1 = str1.length();
        int len2 = str2.length();

        for (int i = min(len1, len2); i > 0; i--) {
            if (isDivisor(i, len1, len2, str1, str2)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }

    private boolean isDivisor(int prefixLength, int len1, int len2, String str1, String str2) {
        if (len1 % prefixLength != 0 || len2 % prefixLength != 0) {
            return false;
        }
        int factor1 = len1 / prefixLength;
        int factor2 = len2 / prefixLength;
        String prefix = str1.substring(0, prefixLength);
        String repeatedPrefix1 = prefix.repeat(factor1);
        String repeatedPrefix2 = prefix.repeat(factor2);
        return repeatedPrefix1.equals(str1) &&
                repeatedPrefix2.equals(str2);
    }
}
