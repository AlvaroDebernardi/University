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
    }

    @Test
    void gameTest() {
        Player player = new Player();
        int pindDown1 = 8;
        int pindDown2 = 2;
        int pindDown3 = 10;
        int pindDown4 = 5;
        int pindDown5 = 4;
        int pindDown6 = 10;
        int pindDown7 = 1;
        int pindDown8 = 0;
        int pindDown9 = 6;
        int pindDown10 = 4;
        int pindDown11 = 5;
        int pindDown12 = 3;
        int pindDown13 = 9;
        int pindDown14 = 1;
        int pindDown15 = 10;
        int pindDown16 = 3;
        int pindDown17 = 4;

        player.roll(pindDown1);
        player.roll(pindDown2);
        player.roll(pindDown3);
        player.roll(pindDown4);
        player.roll(pindDown5);
        player.roll(pindDown6);
        player.roll(pindDown7);
        player.roll(pindDown8);
        player.roll(pindDown9);
        player.roll(pindDown10);
        player.roll(pindDown11);
        player.roll(pindDown12);
        player.roll(pindDown13);
        player.roll(pindDown14);
        player.roll(pindDown15);
        player.roll(pindDown16);
        player.roll(pindDown17);

        assertEquals(127,player.score());
    }

    @Test
    void game2Test() {
        Player player = new Player();
        int pindDown1 = 8;
        int pindDown2 = 2;
        int pindDown3 = 10;
        int pindDown4 = 10;
        //int pindDown5 = 4;
        int pindDown6 = 10;
        int pindDown7 = 1;
        int pindDown8 = 0;
        int pindDown9 = 6;
        int pindDown10 = 4;
        int pindDown11 = 5;
        int pindDown12 = 3;
        int pindDown13 = 9;
        int pindDown14 = 1;
        int pindDown15 = 10;
        int pindDown16 = 3;
        int pindDown17 = 4;

        player.roll(pindDown1);
        player.roll(pindDown2);
        player.roll(pindDown3);
        player.roll(pindDown4);
        //player.roll(pindDown5);
        player.roll(pindDown6);
        player.roll(pindDown7);
        player.roll(pindDown8);
        player.roll(pindDown9);
        player.roll(pindDown10);
        player.roll(pindDown11);
        player.roll(pindDown12);
        player.roll(pindDown13);
        player.roll(pindDown14);
        player.roll(pindDown15);
        player.roll(pindDown16);
        player.roll(pindDown17);

        assertEquals(150,player.score());
    }
}
