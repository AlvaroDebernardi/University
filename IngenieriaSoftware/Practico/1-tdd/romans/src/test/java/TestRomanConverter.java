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
    void basicNumberToRomans() {

        assertEquals(RomanNumber.I, RomanNumber.fromInt(1));
        assertEquals(RomanNumber.V, RomanNumber.fromInt(5));
        assertEquals(RomanNumber.X, RomanNumber.fromInt(10));
        assertEquals(RomanNumber.L, RomanNumber.fromInt(50));
        assertEquals(RomanNumber.C, RomanNumber.fromInt(100));
        assertEquals(RomanNumber.D, RomanNumber.fromInt(500));
        assertEquals(RomanNumber.M, RomanNumber.fromInt(1000));
    }
}
