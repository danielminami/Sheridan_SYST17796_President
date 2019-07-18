/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.model;
import java.util.HashMap;

/**
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
    
    private Suit(int suitNumber, char suitSymbol, String suitName) {
        this.suitNumber = suitNumber;
        this.suitSymbol = suitSymbol;
        this.suitName = suitName;
    }

    private static void initIdLookup() {
        lookupById = new HashMap<Integer, Suit>();
        for (Suit p : values()) {
            lookupById.put(p.suitNumber, p);
        }
    }
    
    private static void initNameLookup() {
        lookupByName = new HashMap<String, Suit>();
        for (Suit p : values())
            lookupByName.put(p.suitName, p);
    }    
    
    /**
     * @return the suitSignal
     */
    public char getSuitSymbol() {
        return suitSymbol;
    }

    /**
     * @return the suitName
     */
    public String getSuitName() {
        return suitName;
    }

    /**
     * @return the suitNumber
     */
    public int getSuitNumber() {
        return suitNumber;
    }
    
    
    
}
