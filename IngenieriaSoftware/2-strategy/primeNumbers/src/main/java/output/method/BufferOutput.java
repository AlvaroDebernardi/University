package output.method;

import java.io.*;

public class BufferOutput implements OutputMethod{
    private final PrintStream oldOutput;
    private final ByteArrayOutputStream buffer;
    private final PrintStream newOutput;

    public BufferOutput() {
        oldOutput = System.out;
        buffer = new ByteArrayOutputStream(1024);
        newOutput = new PrintStream(buffer);
    }

    public BufferOutput(ByteArrayOutputStream buffer) {
        oldOutput = System.out;
        this.buffer = buffer;
        newOutput = new PrintStream(buffer);
    }

	@Override
	public void write(String string) {
        System.setOut(newOutput);
        System.out.print(string);
        System.setOut(oldOutput);
	}

    public String getBuffer() {
        return buffer.toString();
    }

    public void clear() {
        buffer.reset();
    }
}
