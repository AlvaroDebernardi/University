package cell;

import color.*;

public abstract class Cell {
    private int row;
    private int col;

    Color color;
    boolean dead;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

    public boolean isDead() {
        return dead;
    }

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

    public void born(Color color) {
        this.dead = false;
        this.color = color;
    }

	public abstract void kill();
}
