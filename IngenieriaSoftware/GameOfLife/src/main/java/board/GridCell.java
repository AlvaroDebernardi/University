package board;

import java.util.*;
import cell.*;

public class GridCell implements Iterable<Cell> {
    private final int ROWS;
    private final int COLS;
    private List<List<Cell>> cells;

    public GridCell(int rows, int cols, CellFactory cellFactory) {
        this.ROWS = rows;
        this.COLS = cols;
        cells = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            cells.add(new ArrayList<>());
            for (int j = 0; j < rows; j++) {
                cells.get(i).add(cellFactory.createCell(i,j));
            }
        }
    }

	@Override
	public Iterator<Cell> iterator() {
        return new GridIterator();
	}

    private class GridIterator implements Iterator<Cell> {
        private int currentRow;
        private int currentCol;

		@Override
		public boolean hasNext() {
            return currentRow < ROWS && currentCol < COLS;
		}

		@Override
		public Cell next() {
            Cell cell = cells.get(currentRow).get(currentCol);
            currentRow++;
            currentCol = (currentCol + 1) % COLS;
            return cell;
		}
    }
}
