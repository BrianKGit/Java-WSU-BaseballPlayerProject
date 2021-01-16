/*
 * Author:      Brian Klein
 * Date:        10/18/17
 * Program:     BaseballPlayer.java
 * Description: User defined BaseballPlayer class.
 */

public class BaseballPlayer {
    
    private String firstName, lastName;
    private int gamesPlayed, atBats, runs, hits;

    public BaseballPlayer() {
    }

    public BaseballPlayer(String firstName, String lastName, int gamesPlayed, int atBats, int runs, int hits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gamesPlayed = gamesPlayed;
        this.atBats = atBats;
        this.runs = runs;
        this.hits = hits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
    
    public double calculateBattingAvg() {
        double battingAvg;
        if(atBats <= 0)
            battingAvg = 0;
        else
            battingAvg = hits / (double)atBats;
        return battingAvg;
    }

    @Override
    public String toString() {
        return String.format("%n%-11s %-16s %-14d %-10d %-10d %-10d %-5.3f", 
                firstName, lastName, gamesPlayed, atBats, runs, hits,
                calculateBattingAvg());
    }
    
}
