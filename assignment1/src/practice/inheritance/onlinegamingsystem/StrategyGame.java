package practice.inheritance.onlinegamingsystem;

public class StrategyGame extends Game {
    private int strategiesUsed;

    public StrategyGame(String gameName, int strategiesUsed) {
        super(gameName);
        this.strategiesUsed = strategiesUsed;
    }

    @Override
    public void startGame() {
        System.out.println("Starting strategy game: " + gameName + " with " + strategiesUsed + " strategies.");
    }

    @Override
    public void endGame() {
        System.out.println("Ending strategy game: " + gameName);
    }

    @Override
    public int calculateScore() {
        return strategiesUsed * 300;
    }
}
