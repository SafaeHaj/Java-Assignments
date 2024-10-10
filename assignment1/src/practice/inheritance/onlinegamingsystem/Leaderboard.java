package practice.inheritance.onlinegamingsystem;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Leaderboard {
    private Map<Player, Integer> playerScores = new HashMap<>();

    public void addScore(Player player, int score) {
        playerScores.put(player, playerScores.getOrDefault(player, 0) + score);
    }

    public void displayLeaderboard() {
        List<Map.Entry<Player, Integer>> sortedEntries = new ArrayList<>(playerScores.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // Sort by score descending

        System.out.println("Leaderboard:");
        for (Map.Entry<Player, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey().getUsername() + ": " + entry.getValue());
        }
    }
}

