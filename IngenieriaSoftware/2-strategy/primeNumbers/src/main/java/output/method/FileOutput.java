package output.method;

import java.io.*;

public class FileOutput implements OutputMethod{
    private String fileName;

    public FileOutput(String fileName) {
        this.fileName = fileName;
    }

	@Override
	public void write(String string) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

    
}
