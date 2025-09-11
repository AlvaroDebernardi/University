import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestRomanCalculator {

    @Test
    void sumTest() {
        RomanNumber r1 = RomanNumber.valueOf(2);
        RomanNumber r2 = RomanNumber.valueOf(2);

        assertEquals("IV", r1.sum(r2).toString());
    }

    @Test
    void sum2Test() {
        RomanNumber r1 = RomanNumber.valueOf(24);
        RomanNumber r2 = RomanNumber.valueOf(16);

        assertEquals("XL", r1.sum(r2).toString());
    }

    @Test
    void subtractTest() {
        RomanNumber r1 = RomanNumber.valueOf(24);
        RomanNumber r2 = RomanNumber.valueOf(16);

        assertEquals("VIII", r1.subtract(r2).toString());
    }
}
