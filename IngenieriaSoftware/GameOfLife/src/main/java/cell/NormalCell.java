package cell;

import color.NoColor;

public class NormalCell extends Cell {

    public NormalCell(int row, int col) {
        super(row, col);
        color = new NoColor();
        dead = true;
    }

	@Override
	public void kill() {
        dead = true;
        color = new NoColor();
	}
}
