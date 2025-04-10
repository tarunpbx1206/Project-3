/**
 * SYST 17796 Project Base code.
 * @Group Project Tarun Singh and Gurveer Kaur- February 2025.
 */


/**
 * A class that models each Player in the game. 
 *
 * @author Tarun Singh and Gurveer kaur- February 2025
 */



 package ca.sheridancollege.project;

 /**
  * Abstract class representing a Player in the game.
  */
 public abstract class Player {
     private String name;
     private Hand hand;
 
     public Player(String name) {
         this.name = name;
         this.hand = new Hand(); // Default hand when the player is created
     }
 
     public String getName() {
         return name;
     }
 
     public Hand getHand() {
         return hand;
     }
 
     public void setHand(Hand hand) {
         this.hand = hand;
     }
 
     // Abstract method for play (if needed, subclasses can implement specific behavior)
     public abstract void play();
 }
 