package practice.inheritance.onlinegamingsystem;

public class PuzzleGame extends Game {
    private int difficultyLevel;

    public PuzzleGame(String gameName, int difficultyLevel) {
        super(gameName);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public void startGame() {
        System.out.println("Starting puzzle game: " + gameName + " at difficulty level " + difficultyLevel);
    }

    @Override
    public void endGame() {
        System.out.println("Ending puzzle game: " + gameName);
    }

    @Override
    public int calculateScore() {
        return difficultyLevel * 100;
    }
}
