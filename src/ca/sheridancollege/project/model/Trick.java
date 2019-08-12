package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 * This class models a StandardCard. A StandardCard is a Card
 * with an specific ranks and suits and can be used in any Standard Game
 * card game.
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
