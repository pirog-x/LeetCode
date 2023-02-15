package top_interview_questions.easy;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
// time: O(n)
// space: O(n)

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> openBrackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currBracket = s.charAt(i);

            if (currBracket == ')' || currBracket == ']' || currBracket == '}') {
                if (openBrackets.empty()) return false;

                if (currBracket == ')') {
                    if (!(currBracket == openBrackets.pop() + 1)) return false;
                } else {
                    if (!(currBracket == openBrackets.pop() + 2)) return false;
                }
            } else {
                openBrackets.push(currBracket);
            }
        }

        return openBrackets.empty();
    }
}
