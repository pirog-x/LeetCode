package task.java.leetcode75.lvl1;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) return false;
        if (s.isBlank()) return true;
        if (s.isBlank() && t.isBlank()) return true;

        int counter = 0;
        for (int i = 0; i < t.length() && counter < s.length(); i++) {
            if (s.charAt(counter) == t.charAt(i)) {
                counter++;
            }
        }
        return counter == s.length();
    }
}
