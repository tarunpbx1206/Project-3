/**
 * SYST 17796 Project Base code.
 * @ Group Project Tarun Singh and Gurveer Kaur
 */
package ca.sheridancollege.project;

/**
 * Represents a playing card.
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
