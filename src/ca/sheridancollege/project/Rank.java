/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.HashMap;

/**
 *
 * @author Daniel Minami
 */
public enum Rank {
    
    ACE (1, "1", "Ace"),
    TWO (2, "2", "Two"),
    THREE (3, "3", "Three"),
    FOUR (4, "4", "Four"),
    FIVE (5, "5", "Five"),
    SIX (6, "6", "Six"),
    SEVEN (7, "7", "Seven"),
    EIGHT (8, "8", "Eight"),
    NINE (9, "9", "Nine"),
    TEN (10, "10", "Ten"),
    JAKE (11, "J", "Jake"),
    QUEEN (12, "Q", "Queen"),
    KING (13, "K", "King");

    private int rankValue;
    private String rankShortName;
    private String rankLongName;
    
    private static HashMap<Integer, Rank> lookupById = null;
    private static HashMap<String, Rank> lookupByName = null;

    
    private Rank (int rankValue, String rankShortName, String rankLongName) {
        this.rankValue = rankValue;
        this.rankShortName = rankShortName;
        this.rankLongName = rankLongName;
    }
    
    private static void initIdLookup() {
 
        // create the HashMap object with Integer keys and products values
        lookupById = new HashMap<Integer, Rank>();

        // for each Products constant in the enum:
        for (Rank p : values()) {

            // put a new element into the HashMap, using
            // the id number as the key and the constant as the value
            lookupById.put(p.rankValue, p);
        }
    }
    
    private static void initNameLookup() {
        lookupByName = new HashMap<String, Rank>();
        for (Rank p : values())
            lookupByName.put(p.rankLongName, p);
    }

    /**
     * @return the rankValue
     */
    public int getRankValue() {
        return rankValue;
    }

    /**
     * @return the rankShortName
     */
    public String getRankShortName() {
        return rankShortName;
    }

    /**
     * @return the rankLongName
     */
    public String getRankLongName() {
        return rankLongName;
    }
    
    public static Rank getRank(int num) {
        // check first to make sure we haven't already
        // initialized the HashMap
        if (lookupById == null) {
            // load the HashMap
            initIdLookup();
        }
        // get the Products constant for the specified day number
        Rank rank = lookupById.get(num);
        // if there was nothing returned, the ID number is invalid
        if (rank == null) {
            throw new IllegalArgumentException("Invalid rank ID number.");
        }
        // return the Product constant for the id number specified
        return rank;
    }
    
    public static Rank getRank(String name) {
        if (lookupByName == null) {
            initIdLookup();
        }
        Rank rank = lookupByName.get(name);
        if (rank == null) {
            throw new IllegalArgumentException("Invalid rank ID number.");
        }
        return rank;
    }
}
