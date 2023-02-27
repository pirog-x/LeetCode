package task.java.leetcode75.lvl2;

// https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/?envType=study-plan&id=level-2
// time: O(n)
// space: O(n)

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {
        int length = 0;
        int odd = 0;
        Map<String, Integer> cache = new HashMap<>();
        StringBuilder tmp = new StringBuilder();

        for (String s : words) {
            if (cache.containsKey(s)) {
                cache.put(s, cache.get(s) + 1);
            } else {
                cache.put(s, 1);
            }
        }


        for (Map.Entry<String, Integer> pair : cache.entrySet()) {
            tmp.replace(0, tmp.length(), pair.getKey());
            tmp.reverse();

            if (cache.containsKey(tmp.toString())) {
                if (pair.getKey().equals(tmp.toString())) {
                    length += (pair.getValue() / 2) * 4;
                    odd = Math.max(odd, (pair.getValue() % 2) * 2);
                } else {
                    length += 4 * Math.min(pair.getValue(), cache.get(tmp.toString()));
                }

                if (pair.getValue() > cache.get(tmp.toString())) {
                    cache.put(pair.getKey(), pair.getValue() - cache.get(tmp.toString()));
                    cache.put(tmp.toString(), 0);
                } else if (pair.getValue() < cache.get(tmp.toString())) {
                    cache.put(tmp.toString(), cache.get(tmp.toString()) - pair.getValue());
                    cache.put(pair.getKey(), 0);
                } else {
                    cache.put(tmp.toString(), 0);
                    cache.put(pair.getKey(), 0);
                }
            }
        }

        return length + odd;
    }
}
