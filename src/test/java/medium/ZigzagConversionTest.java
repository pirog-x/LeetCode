package medium;

import org.junit.jupiter.api.Test;
import task.java.medium.ZigzagConversion;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {

    ZigzagConversion testClass = new ZigzagConversion();

    @Test
    void convert() {
        String s = "PAYPALISHIRING";
        int rows = 3;

        assertEquals("PAHNAPLSIIGYIR", testClass.convert(s, rows));

        s = "PAYPALISHIRING";
        rows = 4;

        assertEquals("PINALSIGYAHRPI", testClass.convert(s, rows));
    }
}