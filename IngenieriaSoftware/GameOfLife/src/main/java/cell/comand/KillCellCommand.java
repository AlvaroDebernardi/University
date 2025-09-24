package cell.comand;

import cell.Cell;

public class KillCellCommand implements CellCommand {
    private final Cell cell;

	public KillCellCommand(Cell cell) {
        this.cell = cell;
	}

	@Override
	public void execute() {
        cell.kill();
	}

    
}
