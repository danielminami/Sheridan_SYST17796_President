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
public class Round {
    
    private boolean isActive = true;
    private Trick[] trick;

    public Round () {}
    
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

    public void declareWinner(Player player) {
        
    }
}