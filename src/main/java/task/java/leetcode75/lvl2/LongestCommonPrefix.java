package task.java.leetcode75.lvl2;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char tmpChar = strs[0].charAt(i);
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != tmpChar) {
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
}
