/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Rank.values;
import java.util.HashMap;

/**
 *
 * @author Daniel Minami
 */
public enum Suits {
    
    CLUBS (1, '?', "Clubs"), 
    DIAMOND (2, '?', "Diamond"), 
    HEARTS (3, '?', "Hearts"), 
    SPADES (4, '?', "Spades");

    private int suitNumber;
    private char suitSymbol;
    private String suitName;

    private static HashMap<Integer, Suits> lookupById = null;
    private static HashMap<String, Suits> lookupByName = null;    
    
    private Suits(int suitNumber, char suitSymbol, String suitName) {
        this.suitNumber = suitNumber;
        this.suitSymbol = suitSymbol;
        this.suitName = suitName;
    }

    private static void initIdLookup() {
        lookupById = new HashMap<Integer, Suits>();
        for (Suits p : values()) {
            lookupById.put(p.suitNumber, p);
        }
    }
    
    private static void initNameLookup() {
        lookupByName = new HashMap<String, Suits>();
        for (Suits p : values())
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
