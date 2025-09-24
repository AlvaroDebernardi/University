import java.util.List;

import cell.*;
import board.*;

public class Main {
    public static void main(String[] args) {
        CellFactory cf = new NormalCellFactory();

        int rowsTest = 3;
        int colsTest = 3;

        Board board = new Board(rowsTest,colsTest,cf);

        for(Cell cell : board.getCells()) {
            System.out.println("[" + cell.getRow() + "," + cell.getCol() + "]");
        }
    }
}
