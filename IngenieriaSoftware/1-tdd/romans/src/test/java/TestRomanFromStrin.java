import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestRomanFromStrin {

    @Test
    void convertFromString_V() {
        RomanNumber roman = RomanNumber.valueOf(5);
        assertEquals(roman, RomanNumber.valueOf("V"));
    }

    @Test
    void convertFromString_IV() {
        RomanNumber roman = RomanNumber.valueOf(4);
        assertEquals(roman, RomanNumber.valueOf("IV"));
    }
    
}
