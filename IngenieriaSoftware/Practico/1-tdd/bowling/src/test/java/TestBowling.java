import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestBowling {

    @Test
    void playFrameTest() {
        Player player = new Player();
        int pindDown = 8;

        player.roll(pindDown);

        assertEquals(player.score(),8);
    }

    @Test
    void InvalidRollTest() {
        Player player = new Player();
        int pindDown = 11;

        player.roll(pindDown);

        assertThrows(IllegalArgumentException.class, () -> {
            player.roll(pindDown);
        });
    }

    @Test
    void secondRollInvalidTest() {
        Player player = new Player();
        int pindDown1 = 5;
        int pindDown2 = 6;

        player.roll(pindDown1);

        assertThrows(IllegalArgumentException.class, () -> {
            player.roll(pindDown2);
        });
    }


    @Test
    void play2FrameTest() {
        Player player = new Player();
        int pindDown1 = 8;
        int pindDown2 = 2;
        int pindDown3 = 10;

        player.roll(pindDown1);
        player.roll(pindDown2);
        player.roll(pindDown3);

        assertEquals(30,player.score());
        assertEquals(player.spareBonus(),0);
        assertEquals(player.strikeBonus(),1);
    }
}
