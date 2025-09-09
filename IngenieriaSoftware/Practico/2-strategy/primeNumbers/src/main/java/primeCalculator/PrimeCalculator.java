package primeCalculator;

import java.util.List;
import primeCalculator.algorithm.PrimeAlgorithm;

public class PrimeCalculator {

    private PrimeAlgorithm algorithm;

    public PrimeCalculator(PrimeAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public List<Integer> calculate(int number) {
        return algorithm.calculate(number);
    }

    public void setAlgorith(PrimeAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
