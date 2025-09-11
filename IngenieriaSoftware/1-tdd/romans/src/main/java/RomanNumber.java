import java.util.*;

public class RomanNumber {

    private int value;
    private String representation;

    private static List<RomanDigit> digits = initBasicRomanDigits();

    private RomanNumber(int value){
        if (value <= 0 || value > 3000)
            throw new IllegalArgumentException("Not negative, or grater than 3000");

        this.value = value;
        representation = makeRepr(value);
    }

    private RomanNumber(int value, String repr){
        if (value <= 0 || value > 3000)
            throw new IllegalArgumentException("Not negative, or grater than 3000");

        this.value = value;
        this.representation = repr;
    }

	public static RomanNumber valueOf(int value) {
        return new RomanNumber(value);
    }

	public static RomanNumber valueOf(String string) {
        String repr = string;
        int value = makeValue(string);
        return new RomanNumber(value, repr);
    }

	public RomanNumber sum(RomanNumber number) {
        return new RomanNumber(this.value + number.value);
    }

    public RomanNumber subtract(RomanNumber number) {
        return new RomanNumber(this.value - number.value);
    }

    private static int makeValue(String string) {
        int number = 5;

        for (int i=0; i < string.length(); i++) {
            for (RomanDigit romanDigit:digits)
                if (romanDigit.repr == String.valueOf(string.charAt(i)))
                    number += romanDigit.value;

        }
        System.out.println(number);
        return number;
	}

     private String makeRepr(int value) {

        for (RomanDigit rd: digits) {
            if (value == rd.value)
                return rd.repr;

            if (value > rd.value)
                return rd.repr + makeRepr(value - rd.value);
            
            if (value == rd.value - rd.subtracter.value)
                return rd.subtracter.repr + rd.repr;

            if (value > rd.value - rd.subtracter.value)
                return rd.subtracter.repr + rd.repr + makeRepr(value - (rd.value - rd.subtracter.value));
        }
        return "Something went wrong";
	}


	private static List<RomanDigit> initBasicRomanDigits() {
        List<RomanDigit> list = new ArrayList<>();
        
        RomanDigit I = new RomanDigit("I", 1, null);
        RomanDigit V = new RomanDigit("V", 5, I);
        RomanDigit X = new RomanDigit("X", 10, I);
        RomanDigit L = new RomanDigit("L", 50, X);
        RomanDigit C = new RomanDigit("C", 100, X);
        RomanDigit D = new RomanDigit("D", 500, C);
        RomanDigit M = new RomanDigit("M", 1000, C);

        list.add(M);
        list.add(D);
        list.add(C);
        list.add(L);
        list.add(X);
        list.add(V);
        list.add(I);

        return list;
	}

    @Override
    public String toString() {
        return representation;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (!(object instanceof RomanNumber))
            return false;

        RomanNumber romanNumber = (RomanNumber) object;

        return this.value == romanNumber.value;
    }

    @Override
    public int hashCode() {
        return 31 * Integer.hashCode(value) + representation.hashCode();
    }
}
/*
*/
