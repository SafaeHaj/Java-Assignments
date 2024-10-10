package practice.inheritance.onlinegamingsystem;

public class Player {
    private int playerId;
    private String username;

    public Player(int playerId, String username) {
        this.playerId = playerId;
        this.username = username;
    }

    public void playGame(Game game) {
        game.startGame();
        int score = game.calculateScore();
        System.out.println(username + " scored " + score + " in " + game.getGameName());
        game.endGame();
    }

    public void viewProfile() {
        System.out.println("Player ID: " + playerId + ", Username: " + username);
    }

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
    
}
