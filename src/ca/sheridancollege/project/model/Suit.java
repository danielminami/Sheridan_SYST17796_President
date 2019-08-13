package ca.sheridancollege.project.model;
import java.util.HashMap;

/**
 * Enumeration modeling the suits of cards
 *
 * @author Daniel Minami
 */
public enum Suit {
    
    CLUBS (1, '\u2663', "Clubs"), 
    DIAMOND (2, '\u2666', "Diamond"), 
    HEARTS (3, '\u2665', "Hearts"), 
    SPADES (4, '\u2660', "Spades");

    private int suitNumber;
    private char suitSymbol;
    private String suitName;

    private static HashMap<Integer, Suit> lookupById = null;
    private static HashMap<String, Suit> lookupByName = null;    
    
    
    /**
     * Constructs the Enum of Suits
     * 
     * @param suitNumber suit id
     * @param suitSymbol suit symbol
     * @param suitName suit name
     */
    private Suit(int suitNumber, char suitSymbol, String suitName) {
        this.suitNumber = suitNumber;
        this.suitSymbol = suitSymbol;
        this.suitName = suitName;
    }

    /**
     * Starts the lookup Interface by Id
     * 
     */
    private static void initIdLookup() {
        lookupById = new HashMap<Integer, Suit>();
        for (Suit p : values()) {
            lookupById.put(p.suitNumber, p);
        }
    }
    
    /**
     * Starts the lookup Interface by name
     * This method is not being called in the president game, but it is an
     * interesting feature to be implemented for other games, once this Enum
     * is part of the Standard Card.
     * 
     */
    private static void initNameLookup() {
        lookupByName = new HashMap<String, Suit>();
        for (Suit p : values())
            lookupByName.put(p.suitName, p);
    }    
    
    /**
     * Accessor for suit Symbol
     * 
     * @return the suitSignal
     */
    public char getSuitSymbol() {
        return suitSymbol;
    }

    /**
     * Accessor for SuitName
     * 
     * @return the suitName
     */
    public String getSuitName() {
        return suitName;
    }

    /**
     * Acessor for suitNumber
     * 
     * @return the suitNumber
     */
    public int getSuitNumber() {
        return suitNumber;
    }
    
    
    
}
