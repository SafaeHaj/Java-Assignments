package practice.inheritance.onlinegamingsystem;

public class ActionGame extends Game {
    private int level;

    public ActionGame(String gameName, int level) {
        super(gameName);
        this.level = level;
    }

    @Override
    public void startGame() {
        System.out.println("Starting action game: " + gameName + " at level " + level);
    }

    @Override
    public void endGame() {
        System.out.println("Ending action game: " + gameName);
    }

    @Override
    public int calculateScore() {
        return level * 200;
    }
}

