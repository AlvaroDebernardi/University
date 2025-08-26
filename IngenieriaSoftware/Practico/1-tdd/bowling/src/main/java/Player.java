import java.util.LinkedList;
import java.util.Stack;

public class Player {
    private int score;
    private LinkedList<Integer> bonus;
    private int pinsLeft;
    private int framePlayed;
    private int turnOnFrame;

    public Player() {
        score = 0;
        bonus = new LinkedList<>();
        pinsLeft = 10;
        turnOnFrame = 1;
        framePlayed = 0;
    }

    public void roll(int pins) {
        if (pinsLeft - pins < 0)
            throw new IllegalArgumentException(
                "\u001B[31m" + pinsLeft + "-Left " + pins + "-Down\u001B[0m");

        applyPoints(pins);

        if (turnOnFrame == 1) {
            if (pins == 10) {
                pinsLeft = 10;
                bonus.add(2);
                framePlayed++;
            } else {
                pinsLeft -= pins;
                turnOnFrame = 2;
            }
        } else {
            if(pinsLeft - pins == 0)
                bonus.add(1);

            pinsLeft = 10;
            framePlayed++;
            turnOnFrame = 1;
        }
    }

    private void applyPoints(int pinsDown) {
        score += pinsDown;

        for (Integer b : bonus)
            score += pinsDown;

        bonus.removeIf(b -> b == 1);
        bonus.replaceAll(b -> b - 1);
    }

    public int score() {
        return score;
    }
}
