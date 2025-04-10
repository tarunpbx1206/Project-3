


/**
 *
 * @Group Project Tarun Singh and Gurveer Kaur
 */


 package ca.sheridancollege.project;

 import java.util.ArrayList;
 import java.util.Collections;
 
 /**
  * A class to represent the Poker deck.
  */
 public class PokerDeck {
 
     private ArrayList<PokerCard> deck;
 
     public PokerDeck() {
         deck = new ArrayList<>();
         String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
         String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
 
         for (String suit : suits) {
             for (String rank : ranks) {
                 deck.add(new PokerCard(rank, suit));
             }
         }
         shuffleDeck();
     }
 
     public void shuffleDeck() {
         Collections.shuffle(deck);
     }
 
     public PokerCard dealCard() {
         return deck.remove(deck.size() - 1);
     }
 }
 
