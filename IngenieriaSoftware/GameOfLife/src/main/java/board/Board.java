package board;

import java.util.*;
import cell.*;

public class Board {
    private GridCell cells;
    private CellFactory cellFactory;

    public Board(CellFactory cellFactory) {
        cells = new GridCell(60,60, cellFactory);
    }

    public Board(int rows, int cols, CellFactory cellFactory) {
        cells = new GridCell(rows,cols, cellFactory);
    }

    public GridCell getCells() {
        return cells;
    }

    public Board clone() {
        //TODO
        return null;
    }

    public List<Cell> getNeighbors() {
        //TODO
        return null;
    }
}
