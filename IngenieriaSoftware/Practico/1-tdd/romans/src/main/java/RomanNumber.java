import java.util.*;

public class RomanNumber {

    private int value;
    private String representation;

    private static List<RomanDigit> digits = initBasicRomanDigits();

    public RomanNumber(int value){
        if (value <= 0 || value > 3000)
            throw new IllegalArgumentException("Not negative, or grater than 3000");

        this.value = value;
        representation = makeRepr(value);
    }


	public static RomanNumber fromInt(int value) {
        return new RomanNumber(value);
    }

    @Override
    public String toString() {
        return representation;
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
}
/*
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object.getClass() != RomanNumber.class)
            return false;

        object = (RomanNumber) object;

        return this.number.equals(object.number);
    }
*/
