package top_interview_questions.easy;

import org.junit.jupiter.api.Test;
import task.java.top_interview_questions.easy.SqrtX;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    SqrtX testClass = new SqrtX();

    @Test
    void mySqrt() {
        int x = 4;
        int expected = 2;
        assertEquals(expected, testClass.mySqrt(x));

        x = 8;
        expected = 2;
        assertEquals(expected, testClass.mySqrt(x));
    }
}