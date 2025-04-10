

/**
 *
 * @Group Project Tarun Singh and Gurveer Kaur
 */


 package ca.sheridancollege.project;

 /**
  * Represents a poker card with rank and suit.
  */
 public class PokerCard extends Card {
 
     public PokerCard(String rank, String suit) {
         super(rank, suit);
     }
 
     @Override
     public String toString() {
         return getRank() + " of " + getSuit();
     }
 }
 