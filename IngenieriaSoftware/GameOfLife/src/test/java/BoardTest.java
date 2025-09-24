import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import board.*;
import cell.*;

public class BoardTest {

    @Test
    public void boardBuilderTest() {
        CellFactory cf = new NormalCellFactory();

        Board board = new Board(3,3,cf);

        for(Cell cell : board.getCells())
            assertEquals(NormalCell.class, cell.getClass());
    }

    @Test
    public void boardBuilderCellsPositionsTest() {
        CellFactory cf = new NormalCellFactory();

        int rowsTest = 3;
        int colsTest = 3;

        Board board = new Board(rowsTest,colsTest,cf);

        int i = 0;
        int j = 0;

        for(Cell cell : board.getCells()) {
            assertEquals(i, cell.getRow());
            assertEquals(j, cell.getCol());

            j = (j+1) % colsTest;
            if (j == 0)
                i = i++;

            System.out.println("[" + cell.getRow() + "," + cell.getCol() + "]");
        }
    }
}
