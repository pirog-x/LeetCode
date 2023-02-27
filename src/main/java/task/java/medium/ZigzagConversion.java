package task.java.medium;

// https://leetcode.com/problems/zigzag-conversion/

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.isBlank()) return "";
        if (numRows == 1) return s;

        char[] res = new char[s.length()];
        int ptr = 0;
        int ptrCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (ptr >= res.length) {
                ptr = ++ptrCounter;
            }

            res[i] = s.charAt(ptr);
            ptr += (numRows - 1) * 2;
        }



        return String.valueOf(res);
    }
}