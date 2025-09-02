class RomanDigit {
    public final String repr;
    public final int value;
    public final RomanDigit subtracter;

    RomanDigit(String representation, int value, RomanDigit subtracter) {
            this.repr = representation;
            this.value = value;
            this.subtracter = subtracter;
    }
}
