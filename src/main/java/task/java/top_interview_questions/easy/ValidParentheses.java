package task.java.top_interview_questions.easy;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/valid-parentheses/
// time: O(n)
// space: O(n)

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> openBrackets = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char currBracket = s.charAt(i);

            if (currBracket == ')' || currBracket == ']' || currBracket == '}') {
                if (openBrackets.isEmpty()) return false;

                if (currBracket == ')') {
                    if (!(currBracket == openBrackets.pop() + 1)) return false;
                } else {
                    if (!(currBracket == openBrackets.pop() + 2)) return false;
                }
            } else {
                openBrackets.push(currBracket);
            }
        }

        return openBrackets.isEmpty();
    }
}
