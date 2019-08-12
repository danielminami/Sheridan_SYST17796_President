package ca.sheridancollege.project.model;

/**
 * This class models a Player object
 * Player contains a name (String) 
 * Player contains a hand (Hand) 
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class Player {
    
    private String name;
    private Hand hand;
    
    /**
     * Constructs and empty player object
     */
    public Player() {}

    /**
     * Constructor method - Creates a player object with the name
     * of the String passed as argument
     * 
     * @param name - String variable - the players name
     */
    public Player (String name) {
        setName(name);
    }
    
    /**
     * Creates a player object using String name and Hand object passed as args.
     * 
     * @param name - String variable - the players name
     * @param hand - Hand object - a group of cards
     */
    public Player (String name, Hand hand) {
        setName(name);
        setHand(hand);
    }

    /**
     * Accessor method - retrieves the String name of a Player.
     * 
     * @return name - String variable of the player object.
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator method, sets the name of the Player to the name argument
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor method, retrieves the Hand object of a Player.
     * 
     * @return hand - the group of cards belonging to a player
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Mutator method, sets the Hand object of the Player to the hand argument
     * 
     * @param hand - Hand object 
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    /**
     * Displays the String representation of the players name and their Hand
     * 
     * @return String 
     */
    @Override
    public String toString() {
        String playerHand = "";
        for (PresidentCard c: hand)
            playerHand += c.shortString() + "\t";
        return String.format("%s - %s", name, playerHand);
    }
    
}
