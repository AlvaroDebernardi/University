import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    FizzBuzz fb = new FizzBuzz();

    @Test
    void fizzTest() {
        assertTrue(fb.check(3) == FizzBuzzType.FIZZ);
        assertFalse(fb.check(5) == FizzBuzzType.FIZZ);
    }

    @Test
    void buzzTest() {
        assertTrue(fb.check(5) == FizzBuzzType.BUZZ);
        assertFalse(fb.check(6) == FizzBuzzType.BUZZ);
    }

    @Test
    void fizzBuzzTest() {
        assertTrue(fb.check(15) == FizzBuzzType.FIZZBUZZ);
        assertFalse(fb.check(36) == FizzBuzzType.FIZZBUZZ);
    }
}
