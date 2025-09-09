import java.util.List;

import output.*;
import output.method.*;
import primeCalculator.*;
import primeCalculator.algorithm.*;

public class Main {
    public static void main(String[] args) {

        PrimeCalculator pc = new PrimeCalculator(new EratosthenesSieve());

        OutputMethod method = new FileOutput("pruebaSalida.txt");
        Output output = new Output(method);

        List<Integer> primes = pc.calculate(7);

        output.write(primes.toString());
    }
}
