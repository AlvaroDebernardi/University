package primeCalculator.algorithm;

import java.util.*;

public class EratosthenesSieve implements PrimeAlgorithm {

    public List<Integer> calculate(int number) {
        if ( number <= 0)
            throw new IllegalArgumentException("Must be a natural number.");

        BitSet bits = new BitSet(number);
        bits.set(2,number+1);

        for (int i = 2; i <= number; i++) {
            if (bits.get(i) == false)
                continue;

            for (int j = 2; j*i <= number; j++) {
                bits.clear(i*j);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i<= number; i++) {
            if (bits.get(i) == true)
                list.add(i);
        }

        return list;
    }

}
