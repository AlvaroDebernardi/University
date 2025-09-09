package output;

import output.method.OutputMethod;

public class Output {

    private OutputMethod method;

    public Output(OutputMethod method) {
        this.method = method;
    }

    public void write(String string) {
        method.write(string);
    }
}
