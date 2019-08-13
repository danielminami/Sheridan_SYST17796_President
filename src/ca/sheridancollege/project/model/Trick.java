package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 * This class models a Trick. A Round may have many Tricks. A trick holds an
 * Array of active players. Once the player passes, the they are removed from 
 * the Trick.
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class Trick {

    private boolean isActive = true;
    private ArrayList<Turn> turn;
    private ArrayList<Player> activePlayers;
    

    /**
     * Accessor for the isActive field.
     * 
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Mutator for the isActive field.
     * 
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Accessor for the Turn field.
     * 
     * @return the turn
     */
    public ArrayList<Turn> getTurn() {
        return turn;
    }

    /**
     * Mutator for the isActive field.
     * 
     * @param turn the turn to set
     */
    public void setTurn(ArrayList<Turn> turn) {
        this.turn = turn;
    }

    /**
     * Accessor for the activePlayers field.
     * 
     * @return the activePlayers
     */
    public ArrayList<Player> getActivePlayers() {
        return activePlayers;
    }

    /**
     * Mutator for the isActive field.
     * 
     * @param activePlayers the activePlayers to set
     */
    public void setActivePlayers(ArrayList<Player> activePlayers) {
        this.activePlayers = activePlayers;
    }
    
}
