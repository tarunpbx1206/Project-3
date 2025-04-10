package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class to model a Poker game.
 */
public class PokerGame extends Game {

    private PokerDeck deck;

    public PokerGame(String name) {
        super(name);
        this.deck = new PokerDeck();
    }

    @Override
    public void play() {
        // Create players
        PokerPlayer player1 = new PokerPlayer("Alice");
        PokerPlayer player2 = new PokerPlayer("Bob");

        // Assign players to the game
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        setPlayers(players);

        // Deal cards to players
        for (Player player : players) {
            player.setHand(new Hand());  // Initialize a new Hand for the player
            for (int i = 0; i < 2; i++) {  // Two cards for each player
                player.getHand().addCard(deck.dealCard());
            }
        }

        // Display hands of the players
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.getHand());
        }

        // Determine the winner
        declareWinner();
    }

    @Override
    public void declareWinner() {
        // For now, a simple rule: highest card wins (Ace is high)
        Player winner = getPlayers().get(0); // Default winner
        int highestCardValue = 0;

        for (Player player : getPlayers()) {
            int playerScore = evaluateHand(player.getHand());
            System.out.println(player.getName() + " score: " + playerScore);

            if (playerScore > highestCardValue) {
                highestCardValue = playerScore;
                winner = player;
            }
        }

        System.out.println("The winner is " + winner.getName());
    }

    private int evaluateHand(Hand hand) {
        int score = 0;
        for (Card card : hand.getCards()) {
            switch (card.getRank()) {
                case "A": score += 14; break;
                case "K": score += 13; break;
                case "Q": score += 12; break;
                case "J": score += 11; break;
                default: score += Integer.parseInt(card.getRank());
            }
        }
        return score;
    }
}

