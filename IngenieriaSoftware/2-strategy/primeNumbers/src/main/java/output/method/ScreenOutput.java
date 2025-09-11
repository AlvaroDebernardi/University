package output.method;

public class ScreenOutput implements OutputMethod{

	@Override
	public void write(String string) {
        System.out.println(string);
	}
}
