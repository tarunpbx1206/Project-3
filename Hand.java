


/**
 *
 * @author Tarun Singh and Gurveer Kaur
 */

 package ca.sheridancollege.project;

 import java.util.ArrayList;
 import java.util.List;
 
 /**
  * Represents a player's hand in Poker.
  */
 public class Hand {
 
     private List<Card> cards;
 
     public Hand() {
         cards = new ArrayList<>();
     }
 
     public void addCard(Card card) {
         cards.add(card);
     }
 
     public List<Card> getCards() {
         return cards;
     }
 
     @Override
     public String toString() {
         return cards.toString();
     }
 }
 
