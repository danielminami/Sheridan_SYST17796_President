package ca.sheridancollege.project.model;

/**
 * This class models a Round. The Round controls the game Tricks and declares
 * the winner, finishing the game instance
 * 
 * @author Daniel Minami
 */
public class Round {
    
    private boolean isActive = true;
    private Player winner;
    private Trick[] trick;

    public Round () {}
    
    /**
     * Accessor to the field isActive
     * 
     * @return true if the round is active
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Mutator to field isActive
     * 
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Accessor to the field Trick
     * 
     * @return the trick
     */
    public Trick[] getTrick() {
        return trick;
    }

    /**
     * Mutator to field isActive
     * 
     * @param trick the trick to set
     */
    public void setTrick(Trick[] trick) {
        this.trick = trick;
    }

    /**
     * This method declares the Round winner.
     * 
     * @return the Round winner
     */
    public String declareWinner() {
        return winner.toString();
    }

    /**
     * Accessor to field winner
     * 
     * @return the winner
     */
    public Player getWinner() {
        return winner;
    }

    /**
     * Mutator to field winner
     * 
     * @param winner the winner to set
     */
    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
