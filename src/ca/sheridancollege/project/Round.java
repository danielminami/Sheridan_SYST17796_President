/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Daniel Minami
 */
public class Round {
    
    private boolean isActive = true;
    private Trick[] trick;
    private ArrayList<Player> activePlayers;
    private ArrayList<Player> winningOrder;

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
     * @return the trick
     */
    public Trick[] getTrick() {
        return trick;
    }

    /**
     * @param trick the trick to set
     */
    public void setTrick(Trick[] trick) {
        this.trick = trick;
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

    /**
     * @return the winningOrder
     */
    public ArrayList<Player> getWinningOrder() {
        return winningOrder;
    }

    /**
     * @param winningOrder the winningOrder to set
     */
    public void setWinningOrder(ArrayList<Player> winningOrder) {
        this.winningOrder = winningOrder;
    }
     
}
