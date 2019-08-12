package ca.sheridancollege.project.model;

import java.util.HashMap;

/**
 * Enumeration modeling the ranks of cards for the game president
 * Same as a standard deck of cards with 2 exceptions:
 * Two - is the highest ranked card
 * Ace - is always second highest rank card 
 * Rank from highest to lowest (2,A,K,Q,J,10,9,8,7,6,5,4,3)
 * 
 * @author Daniel Minami
 */
public enum Rank {
    
    ACE (1, "A", "Ace"),
    TWO (99, "2", "Two"),
    THREE (3, "3", "Three"),
    FOUR (4, "4", "Four"),
    FIVE (5, "5", "Five"),
    SIX (6, "6", "Six"),
    SEVEN (7, "7", "Seven"),
    EIGHT (8, "8", "Eight"),
    NINE (9, "9", "Nine"),
    TEN (10, "10", "Ten"),
    JAKE (11, "J", "Jack"),
    QUEEN (12, "Q", "Queen"),
    KING (13, "K", "King");

    private int rankValue;
    private String rankShortName;
    private String rankLongName;
    
    private static HashMap<Integer, Rank> lookupById = null;
    private static HashMap<String, Rank> lookupByName = null;

    /**
     * Constructor for Rank, 
     * set to private to protect the enumeration from being modified
     * 
     * @param rankValue int - value of Card
     * @param rankShortName String - shortened name of card
     * @param rankLongName String - full name of card
     */
    private Rank (int rankValue, String rankShortName, String rankLongName) {
        this.rankValue = rankValue;
        this.rankShortName = rankShortName;
        this.rankLongName = rankLongName;
    }
    
    /**
     * Starts the lookup Interface by Id
     * 
     */
    private static void initIdLookup() {

        lookupById = new HashMap<Integer, Rank>();
        for (Rank p : values()) {
            lookupById.put(p.rankValue, p);
        }
    }

    /**
     * Starts the lookup Interface by Name
     * 
     */    
    private static void initNameLookup() {
        lookupByName = new HashMap<String, Rank>();
        for (Rank p : values())
            lookupByName.put(p.rankLongName, p);
    }

    /**
     * Accessor for the rank value
     * 
     * @return the rankValue
     */
    public int getRankValue() {
        return rankValue;
    }

    /**
     * Accessor for the rank Short String
     * 
     * @return the rankShortName
     */
    public String getRankShortName() {
        return rankShortName;
    }

    /**
     * Accessor for the rank Short String
     * 
     * @return the rankLongName
     */
    public String getRankLongName() {
        return rankLongName;
    }
    
    /**
     * Lookup Interface to find a rank by Id
     * 
     * @param num id to be found
     * @return the card rank
     */
    public static Rank getRank(int num) {
        if (lookupById == null) {
            initIdLookup();
        }

        Rank rank = lookupById.get(num);

        if (rank == null) {
            throw new IllegalArgumentException("Invalid rank ID number.");
        }

        return rank;
    }

    /**
     * Lookup Interface to find a rank by name
     * 
     * @param num name to be found
     * @return the card rank
     */    
    public static Rank getRank(String name) {
        if (lookupByName == null) 
            initIdLookup();
    
        Rank rank = lookupByName.get(name);
        if (rank == null) {
            throw new IllegalArgumentException("Invalid rank name.");
        }
        return rank;
    }
}
