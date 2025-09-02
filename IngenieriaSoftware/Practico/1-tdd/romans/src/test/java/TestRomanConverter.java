import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestRomanConverter {

    @Test
    void graterThan3000Test() {

        assertThrows(IllegalArgumentException.class, () -> {
                RomanNumber.fromInt(3001);
        });
    }

    @Test
    void equalThan0Test() {

        assertThrows(IllegalArgumentException.class, () -> {
                RomanNumber.fromInt(0);
        });
    }

    @Test
    void lesserThan0Test() {
        assertThrows(IllegalArgumentException.class, () -> {
                RomanNumber.fromInt(-3);
        });
    }

    @Test
    void basicRomanNumbers() {
        assertEquals("I", RomanNumber.fromInt(1).toString());
        assertEquals("V", RomanNumber.fromInt(5).toString());
        assertEquals("X", RomanNumber.fromInt(10).toString());
        assertEquals("L", RomanNumber.fromInt(50).toString());
        assertEquals("C", RomanNumber.fromInt(100).toString());
        assertEquals("D", RomanNumber.fromInt(500).toString());
        assertEquals("M", RomanNumber.fromInt(1000).toString());
    }

    @Test
    void romanFrom2() {
        assertEquals("II", RomanNumber.fromInt(2).toString());
    }

    @Test
    void romanFrom4() {
        assertEquals("IV", RomanNumber.fromInt(4).toString());
    }

    @Test
    void romanFrom6() {
        assertEquals("VI", RomanNumber.fromInt(6).toString());
    }

    @Test
    void romanFrom9() {
        assertEquals("IX", RomanNumber.fromInt(9).toString());
    }

    @Test
    void romanFrom19() {
        assertEquals("XIX", RomanNumber.fromInt(19).toString());
    }

    @Test
    void romanFrom24() {
        assertEquals("XXIV", RomanNumber.fromInt(24).toString());
    }

    @Test
    void romanFrom40() {
        assertEquals("XL", RomanNumber.fromInt(40).toString());
    }

    @Test
    void romanFrom44() {
        assertEquals("XLIV", RomanNumber.fromInt(44).toString());
    }

    @Test
    void romanFrom58() {
        assertEquals("LVIII", RomanNumber.fromInt(58).toString());
    }

    @Test
    void romanFrom90() {
        assertEquals("XC", RomanNumber.fromInt(90).toString());
    }

    @Test
    void romanFrom2999() {
        assertEquals("MMCMXCIX", RomanNumber.fromInt(2999).toString());
    }
}
