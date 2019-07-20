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
            tempHand.add(player.getHand().get(i));
        }
        
        //valid hand selection
        if (tempHand.compareTo(tempHand) == 0) {
            //case board is empty
            if ((board == null) || board.isEmpty()) {
                //fill the board with the Hand's content
                for(PresidentCard c: tempHand)
                    board.add(c);
                //remove the cards from the players hand
                player.getHand().removeFromHand(tempHand);
            } else if (board.size() == tempHand.size()) {
                if (board.moveAllowed(tempHand)) {
                    board.clear();
                    for (PresidentCard c: tempHand)
                        board.add(c);
                    player.getHand().removeFromHand(tempHand);
                } else {
                    throw new IllegalArgumentException("Error: You have to play"
                            + " cards within the same length as the board and"
                            + " greater Rank.");
                }
            } else {
                throw new IllegalArgumentException("Error: Invalid number "
                        + "of cards selected");
            }
            
        } else {
            throw new IllegalArgumentException("Error: to play more than "
                    + "one card, they must be equals and match the current "
                    + "board length.");
        }
        
       
    }
    
    public void passTurn() {
        setIsActive(false);
    }

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
