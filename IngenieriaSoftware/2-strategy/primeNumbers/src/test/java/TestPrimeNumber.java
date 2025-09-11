import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import primeCalculator.*;
import primeCalculator.algorithm.EratosthenesSieve;
import primeCalculator.algorithm.PrimeAlgorithm;

public class TestPrimeNumber {

    @Test
    public void oneTest() {
        PrimeAlgorithm algorithm = new EratosthenesSieve();
        PrimeCalculator pc = new PrimeCalculator(algorithm);

        List<Integer> list = new ArrayList<>();

        assertEquals(list, pc.calculate(1));
    }

    @Test
    public void twoTest() {
        PrimeAlgorithm algorithm = new EratosthenesSieve();
        PrimeCalculator pc = new PrimeCalculator(algorithm);

        List<Integer> list = new ArrayList<>();
        list.add(2);

        assertEquals(list, pc.calculate(2));
    }

    @Test
    public void fiveTest() {
        PrimeAlgorithm algorithm = new EratosthenesSieve();
        PrimeCalculator pc = new PrimeCalculator(algorithm);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);

        assertEquals(list, pc.calculate(5));
    }

    @Test
    public void twentieTest() {
        PrimeAlgorithm algorithm = new EratosthenesSieve();
        PrimeCalculator pc = new PrimeCalculator(algorithm);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);

        assertEquals(list, pc.calculate(20));
    }
}
