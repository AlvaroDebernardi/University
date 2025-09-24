package cell.comand;

import color.Color;
import cell.Cell;

public class BornCellCommand implements CellCommand {
    private final Cell cell;
    private final Color color;

	public BornCellCommand(Cell cell, Color color) {
        this.cell = cell;
        this.color = color;
	}

	@Override
	public void execute() {
        cell.born(color);
	}

    
}
