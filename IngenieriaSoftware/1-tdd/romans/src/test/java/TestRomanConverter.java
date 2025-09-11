import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestRomanConverter {

    @Test
    void graterThan3000Test() {

        assertThrows(IllegalArgumentException.class, () -> {
                RomanNumber.valueOf(3001);
        });
    }

    @Test
    void equalThan0Test() {

        assertThrows(IllegalArgumentException.class, () -> {
                RomanNumber.valueOf(0);
        });
    }

    @Test
    void lesserThan0Test() {
        assertThrows(IllegalArgumentException.class, () -> {
                RomanNumber.valueOf(-3);
        });
    }

    @Test
    void basicRomanNumbers() {
        assertEquals("I", RomanNumber.valueOf(1).toString());
        assertEquals("V", RomanNumber.valueOf(5).toString());
        assertEquals("X", RomanNumber.valueOf(10).toString());
        assertEquals("L", RomanNumber.valueOf(50).toString());
        assertEquals("C", RomanNumber.valueOf(100).toString());
        assertEquals("D", RomanNumber.valueOf(500).toString());
        assertEquals("M", RomanNumber.valueOf(1000).toString());
    }

    @Test
    void romanFrom2() {
        assertEquals("II", RomanNumber.valueOf(2).toString());
    }

    @Test
    void romanFrom4() {
        assertEquals("IV", RomanNumber.valueOf(4).toString());
    }

    @Test
    void romanFrom6() {
        assertEquals("VI", RomanNumber.valueOf(6).toString());
    }

    @Test
    void romanFrom9() {
        assertEquals("IX", RomanNumber.valueOf(9).toString());
    }

    @Test
    void romanFrom19() {
        assertEquals("XIX", RomanNumber.valueOf(19).toString());
    }

    @Test
    void romanFrom24() {
        assertEquals("XXIV", RomanNumber.valueOf(24).toString());
    }

    @Test
    void romanFrom40() {
        assertEquals("XL", RomanNumber.valueOf(40).toString());
    }

    @Test
    void romanFrom44() {
        assertEquals("XLIV", RomanNumber.valueOf(44).toString());
    }

    @Test
    void romanFrom58() {
        assertEquals("LVIII", RomanNumber.valueOf(58).toString());
    }

    @Test
    void romanFrom90() {
        assertEquals("XC", RomanNumber.valueOf(90).toString());
    }

    @Test
    void romanFrom2999() {
        assertEquals("MMCMXCIX", RomanNumber.valueOf(2999).toString());
    }
}
