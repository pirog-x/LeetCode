package top_interview_questions.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses testClass = new ValidParentheses();

    @Test
    void isValid() {
        String brackets = "()";
        assertTrue(testClass.isValid(brackets));

        brackets = "()[]{}";
        assertTrue(testClass.isValid(brackets));

        brackets = "(]";
        assertFalse(testClass.isValid(brackets));

        brackets = "((";
        assertFalse(testClass.isValid(brackets));
    }
}