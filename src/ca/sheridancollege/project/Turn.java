/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Daniel Minami
 */
public class Turn {
    private Player player;
    
    public Turn (Player player) {
        setPlayer(player);
    }
    
    public void playTurn() {}
    
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
}
