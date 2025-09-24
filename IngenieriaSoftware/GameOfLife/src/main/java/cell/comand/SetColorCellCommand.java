package cell.comand;

import cell.Cell;
import color.Color;

public class SetColorCellCommand implements CellCommand {
    private final Cell cell;
    private final Color color;

	public SetColorCellCommand(Cell cell, Color color) {
        this.cell = cell;
        this.color = color;
	}


	@Override
	public void execute() {
        cell.setColor(color);
	}

    
}
