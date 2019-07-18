/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.model;

/**
 *
 * @author Daniel Minami
 */
public class Player {
    
    private String name;
    private Hand hand;
    
    public Player() {}

    public Player (String name) {
        setName(name);
    }
    
    public Player (String name, Hand hand) {
        setName(name);
        setHand(hand);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    /**
     * 
     * @return returns the string representation of a Player
     */
    @Override
    public String toString() {
        String playerHand = "";
        for (PresidentCard c: hand)
            playerHand += c.shortString() + "\t";
        return String.format("%s - %s", name, playerHand);
    }
    
}
