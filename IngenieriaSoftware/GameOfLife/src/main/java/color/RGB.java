package color;

import java.util.List;

public class RGB implements Color {
    private int red;
    private int green;
    private int blue;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

	@Override
	public List<Integer> rgb() {
        return List.of(red,green,blue);
	}

    @Override
    public int hashCode() {
        int result = Integer.hashCode(red);
        result = 31 * result + Integer.hashCode(green);
        result = 31 * result + Integer.hashCode(blue);
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (!(obj instanceof RGB))
			return false;

        RGB rgbObj = (RGB) obj;

        boolean bool = (
            red == rgbObj.red && green == rgbObj.green && blue == rgbObj.blue
        );

		return bool;
	}
}
