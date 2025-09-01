import java.util.LinkedList;

public class RomanNumber {

    public static final LinkedList<Integer> I = 1;
    public static final LinkedList<Integer> V = 5;
    public static final LinkedList<Integer> X = 10;
    public static final LinkedList<Integer> L = 50;
    public static final LinkedList<Integer> C = 100;
    public static final LinkedList<Integer> D = 500;
    public static final LinkedList<Integer> M = 1000;

    LinkedList<Integer> number;

    public RomanNumber(){
        number = new LinkedList<>();
    }

    RomanNumber fromInt(int number) {
        if (number <= 0 || number > 3000)
            throw new IllegalArgumentException("Not negative, or grater than 3000");
        switch (number) {
            case 1:
                roman = RomanNumber.I;
                break;
            case 5:
                roman = RomanNumber.V;
                break;
            case 10:
                roman = RomanNumber.X;
                break;
            case 50:
                roman = RomanNumber.L;
                break;
            case 100:
                roman = RomanNumber.C;
                break;
            case 500:
                roman = RomanNumber.D;
                break;
            case 1000:
                roman = RomanNumber.M;
                break;

            default:
                throw new IllegalArgumentException(
                        "Not implemented for any number");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object.getClass() != RomanNumber.class)
            return false;

        object = (RomanNumber) object;

        return this.number.equals(object.number);
    }
}
