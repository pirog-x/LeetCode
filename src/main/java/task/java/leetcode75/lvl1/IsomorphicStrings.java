package task.java.leetcode75.lvl1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        if (checkValidRelation(t, s)) return false;

        if (checkValidRelation(s, t)) return false;

        return true;
    }

    private boolean checkValidRelation(String s, String t) {
        Map<Character, Character> map = new HashMap<>(t.length());
        for (int i = 0; i < t.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (map.containsKey(key)) {
                if (!map.get(key).equals(value))
                    return true;
            }
            map.put(key, value);
        }
        return false;
    }
}
