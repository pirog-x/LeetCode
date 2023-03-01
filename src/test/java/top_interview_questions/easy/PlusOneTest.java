package top_interview_questions.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import task.java.interview.easy.PlusOne;


class PlusOneTest {

    PlusOne testClass = new PlusOne();

    @Test
    void plusOne() {
        int[] digits = new int[] {4,3,2,1};
        int[] expected = new int[] {4,3,2,2};
        Assertions.assertThat(testClass.plusOne(digits)).isEqualTo(expected);

        digits = new int[] {9};
        expected = new int[] {1,0};
        Assertions.assertThat(testClass.plusOne(digits)).isEqualTo(expected);

        digits = new int[] {8,9,9,9};
        expected = new int[] {9,0,0,0};
        Assertions.assertThat(testClass.plusOne(digits)).isEqualTo(expected);

        digits = new int[] {9,8,9};
        expected = new int[] {9,9,0};
        Assertions.assertThat(testClass.plusOne(digits)).isEqualTo(expected);
    }
}