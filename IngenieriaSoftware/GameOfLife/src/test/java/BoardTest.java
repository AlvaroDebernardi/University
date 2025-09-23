import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import board.*;
import cell.*;
import color.*;

public class BoardTest {

    @Test
    public void boardBuilderTest() {
        CellFactory cf = new NormalCellFactory();

        Board board = new Board(cf);
    }
}
