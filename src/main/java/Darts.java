//branch DARTS_INITIAL

public class Darts {
    enum Multiplier {
        DOUBLE, TRIPLE, XX;
    }

    private int score = 301;
    private int dartsLeft = 3;
    private boolean isFinished = false;
    private int turn = 1;
    private int lastTurnScore = score;

    public int score() {
        return score;
    }

    public int dartsLeft() {
        return dartsLeft;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int turn() {
        return turn;
    }

    public int lastTurnScore() {
        return lastTurnScore;
    }
}

//Darts class in MASTER
