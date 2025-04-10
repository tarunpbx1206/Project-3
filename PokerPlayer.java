/**
 *
 * @Group Project Tarun Singh and Gurveer Kaur
 */

package ca.sheridancollege.project;

/**
 * A concrete class representing a player in Poker.
 */
public class PokerPlayer extends Player {

    private Hand hand;
    private int totalWins;
    private int gamesPlayed;

    public PokerPlayer(String name) {
        super(name);
        this.hand = new Hand();
        this.totalWins = 0;
        this.gamesPlayed = 0;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void addWin() {
        totalWins++;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void incrementGamesPlayed() {
        gamesPlayed++;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing their turn...");
    }

    public void printStats() {
        System.out.println("--- " + getName() + "'s Statistics ---");
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Total Wins: " + totalWins);
        System.out.println("Win Rate: " + (gamesPlayed > 0 ? (totalWins * 100 / gamesPlayed) + "%" : "N/A"));
        System.out.println("------------------------------------");
    }
}