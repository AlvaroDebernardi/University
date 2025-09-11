public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.printFB(100);
    }

    public void printFB(int n) {
        for (int i=1; i<100; i++) {
            FizzBuzzType type = check(i);

            if (type == FizzBuzzType.NONE)
                System.out.println(i);
            else
                System.out.println(type);
        }
        
    }

    public FizzBuzzType check(int num) {
        if (num % 3 == 0 && num % 5 == 0)
            return FizzBuzzType.FIZZBUZZ;

        if (num % 5 == 0)
            return FizzBuzzType.BUZZ;

        if (num % 3 == 0)
            return FizzBuzzType.FIZZ;

        return FizzBuzzType.NONE;
    }

}
