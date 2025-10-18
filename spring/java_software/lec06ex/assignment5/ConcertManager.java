package assignment5;

public class ConcertManager {
    private Player[] players;
    private int playerCount;

    public ConcertManager(int capacity) {
        players = new Player[capacity];
        playerCount = 0;
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount++] = player;
        } else {
            System.out.println("演奏者の定員に達しました。");
        }
    }

    public void startConcert() {
        System.out.println("コンサートが始まります！");
        for (int i = 0; i < playerCount; i++) {
            players[i].perform();
        }
    }
}
