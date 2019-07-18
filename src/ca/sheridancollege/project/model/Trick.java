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
public class Trick {

    private boolean isActive = true;
    private ArrayList<Turn> turn;
    private ArrayList<Player> activePlayers;
    
    public void resetTrick() {}
    
    public void newTrick() {}
    
    public boolean checkEndOfTrick() {
        //stub
        return false;
    }
    
    public void newTurn() {}

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

    /**
     * @return the turn
     */
    public ArrayList<Turn> getTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(ArrayList<Turn> turn) {
        this.turn = turn;
    }

    /**
     * @return the activePlayers
     */
    public ArrayList<Player> getActivePlayers() {
        return activePlayers;
    }

    /**
     * @param activePlayers the activePlayers to set
     */
    public void setActivePlayers(ArrayList<Player> activePlayers) {
        this.activePlayers = activePlayers;
    }
    
}
