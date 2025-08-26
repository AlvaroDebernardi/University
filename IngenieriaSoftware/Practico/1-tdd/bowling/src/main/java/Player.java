import java.util.Stack;

public class Player {
    private int score;
    private int spareBonus;
    private int strikeBonus;
    private int pinsLeft;
    private int framePlayed;
    private int turnOnFrame;

    public Player() {
        score = 0;
        spareBonus = 0;
        strikeBonus = 0;
        pinsLeft = 10;
        framePlayed = 0;
        turnOnFrame = 1;
    }

    public void roll(int pins) {
        if (pinsLeft - pins < 0)
            throw new IllegalArgumentException("the number of pins are grater that are left");
        score += pins;

        if (spareBonus == 1) {
            score += 2 * pins;
            spareBonus = 0;
        }
        if (strikeBonus >= 1) {
            score += 2 * pins;
            strikeBonus -= 1;
        }

        if (turnOnFrame == 1) {
            if (pins == 10) {
                pinsLeft = 10;
                strikeBonus += 2;
                framePlayed++;
            } else {
                pinsLeft -= pins;
                turnOnFrame = 2;
            }
        } else {
            if(pinsLeft == 0) {
                spareBonus++;
            }
            pinsLeft = 10;
            framePlayed++;
            turnOnFrame = 1;
        }
    }

    public int score() {
        return score;
    }

    public int spareBonus() {
        return spareBonus;
    }

    public int strikeBonus() {
        return strikeBonus;
    }
}
