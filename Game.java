/**
 * SYST 17796 Project Base code.
 * @Group Project Tarun Singh and Gurveer Kaur
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models a game.
 */
public abstract class Game {

    private final String name;  // The title of the game
    private ArrayList<Player> players;  // The players in the game

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play();

    public abstract void declareWinner();
}

