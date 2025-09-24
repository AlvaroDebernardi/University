import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import cell.*;
import color.*;

public class CellTest {

    @Test
    public void cellBuilderTest() {
        Cell cell = new NormalCell(1,1);

        assertEquals(true, cell.isDead());
    }

    @Test
    public void cellBornTest() {
        Cell cell = new NormalCell(1,1);
        Color color = new RGB(255,255,255);

        cell.born(color);

        assertEquals(color, cell.getColor());
        assertEquals(false, cell.isDead());
    }

    @Test
    public void cellSetColorTest() {
        Cell cell = new NormalCell(1,1);
        Color color = new RGB(255,255,255);

        cell.setColor(color);

        assertEquals(color, cell.getColor());
    }
}
