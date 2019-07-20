/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Minami
 */
public class Turn {
    private Player player;
    private boolean isActive = true;
    
    public Turn (Player player) {
        setPlayer(player);
    }
    
    public void playTurn(ArrayList<Integer> playerMoves, Board board) {
        Hand tempHand = new Hand();
        for (Integer i: playerMoves){       
            tempHand.add(getPlayer().getHand().get(i));
        }
        
        //Conditions for 1 Card Movement
        if (tempHand.size() == 1) {
            
            //In case board is Empty, temp Hand is played
            if (board.size() == 0){
                for(PresidentCard c: tempHand)
                    board.add(c);
                
            //In case board already has a card on top    
            } else if (board.size() == 1) {
                if (board.moveAllowed(tempHand.get(0))){
                    board.remove(0);
                    board.add(tempHand.get(0));  
                } else {
                    throw new IllegalArgumentException("Error: Movement not "
                            + "allowed. This Card cannot be played after " + 
                            board.toString());
                }

            }
            
            //In case board has more than one card on top, we will probably need 1 if for each condition.
            
            
        } else if (tempHand.size() == 2) {
            //first test if the cards have the same rank and can be played together
            if (tempHand.get(0).compareTo(tempHand.get(1)) == 0) {
                //Ok, cards are the same
            } else {
                throw new IllegalArgumentException("Error: Movement not "
                        + "allowed. Only Cards within the same ranking "
                        + "can be played together.");
            }
                
            
            
        } else if (tempHand.size() == 3) {
            
        } else if (tempHand.size() == 4) {

        } else if (tempHand.size() > 4) {
            throw new IllegalArgumentException("Error: Movement not allowed,"
                    + " you can play 4 card at maximum.");
        }
        
    }
    
    public void passTurn() {}

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
