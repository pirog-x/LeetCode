package task.java.leetcode75.lvl1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorOfStringsTest {

    private GreatestCommonDivisorOfStrings testable = new GreatestCommonDivisorOfStrings();

    @ParameterizedTest
    @CsvSource({
            "ABCABC,ABC,ABC",
            "ABABAB,ABAB,AB",
            "LEET,CODE,''",
            "ABCDEF,ABC,''",
    })
    public void test(String str1, String str2, String expected) {
        // Act
        var actual = testable.gcdOfStrings(str1, str2);
        // Assert
        assertEquals(expected, actual);
    }

}