package se.floremila.träningspel;

public class Score {
    private Tärning[] tärning;
    private Player player;

    public Score(Tärning[] tärning, Player player) {
        this.tärning = tärning;
        this.player = player;
    }

    public Tärning[] getTärning() {
        return tärning;
    }

    public Player getPlayer() {
        return player;
    }

    public int getTotalScore() {
        int total = 0;
        for(int i =0; i < tärning.length; i++) {
            total += tärning[i].getResult();
        }
        return total;


    }


}
