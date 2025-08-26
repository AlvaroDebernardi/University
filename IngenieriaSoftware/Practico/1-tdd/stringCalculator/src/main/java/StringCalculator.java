public class StringCalculator {
    private String delimiter;

    public StringCalculator(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public int add(String string) {
        if (string.length() == 0)
            return 0;

        String[] lines = string.split("\n");
        int linesCant = lines.length;

        int i = 0;
        if (lines[0].matches("^//(.)+$")) {
            delimiter = lines[0].substring(2);
            i = 1;
        }

        int sum = 0;
        for (; i < linesCant; i++)
            for (String s : lines[i].split(delimiter)) {
                int num = Integer.parseInt(s);
                if (num <= 1000)
                    sum += Integer.parseInt(s);
            }

        return sum;
    }
}
