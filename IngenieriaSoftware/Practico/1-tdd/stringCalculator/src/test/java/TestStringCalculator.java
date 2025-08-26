import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestStringCalculator {

    @Test
    void emptyStringTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(0, sc.add(""));
    }

    @Test
    void oneCharacterStringTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(3, sc.add("3"));
    }

    @Test
    void twoNumberStringTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(45, sc.add("3,42"));
    }

    @Test
    void negativeNumberTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(43, sc.add("3,42,-2"));
    }

    @Test
    void lotNumberTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(48, sc.add("3,42,-2,4,6,-5"));
    }

    @Test
    void newLineStringTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(27, sc.add("15\n15,-3"));
    }

    @Test
    void changeDelimiterTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(27, sc.add("//;\n15\n15;-3"));
    }

    @Test
    void largeNumbersTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(2, sc.add("//;\n10001;2"));
    }

    @Test
    void variableLenghtDelimiterTest() {
        StringCalculator sc = new StringCalculator(",");

        assertEquals(12, sc.add("//,;,\n10,;,2"));
    }
}
