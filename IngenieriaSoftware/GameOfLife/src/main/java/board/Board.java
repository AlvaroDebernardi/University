package board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cell.*;

public class Board {
    private GridCell cells;
    private CellFactory cellFactory;

    public Board(CellFactory cellFactory) {
        cells = new GridCell(60,60, cellFactory);
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
