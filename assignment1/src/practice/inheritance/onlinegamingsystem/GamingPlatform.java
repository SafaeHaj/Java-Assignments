package practice.inheritance.onlinegamingsystem;

public class GamingPlatform {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");

        Game puzzleGame = new PuzzleGame("Sudoku", 3);
        Game actionGame = new ActionGame("Battle Royale", 5);
        Game strategyGame = new StrategyGame("Civilization", 4);

        Leaderboard leaderboard = new Leaderboard();

        player1.playGame(puzzleGame);
        player2.playGame(actionGame);
        player1.playGame(strategyGame);
        
        leaderboard.addScore(player1, puzzleGame.calculateScore());
        leaderboard.addScore(player2, actionGame.calculateScore());
        leaderboard.addScore(player1, strategyGame.calculateScore());

        leaderboard.displayLeaderboard();
    }
}
