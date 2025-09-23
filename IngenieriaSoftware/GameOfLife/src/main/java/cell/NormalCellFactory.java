package cell;

public class NormalCellFactory implements CellFactory {

	@Override
	public Cell createCell(int row, int col) {
        return new NormalCell(row, col);
	}
}
