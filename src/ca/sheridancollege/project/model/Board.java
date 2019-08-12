package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card;
import java.util.ArrayList;

/**
 * This class models the board, it holds the group of cards played last
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class Board extends GroupOfCards {

    public static final int DECK_SIZE_PRESIDENT = 52;
    
    /**
     * Constructs an object Board using the constant DECK_SIZE_PRESIDENT
     */
    public Board () {
        super(DECK_SIZE_PRESIDENT);
    }
    
    /**
     * This method returns true if the group of cards played is equal 
     * or higher value than the cards on the board.
     * 
     * @param g - Group of cards played by the current player
     * @return - True for valid move, false otherwise
     */    
    public boolean moveAllowed(GroupOfCards g){
        Hand c = (Hand)g;
        if (this.get(0).compareTo(c.get(0)) <= 0)
            return true;
        return false;
    }
    
    /**
     * This method returns an integer representing the difference between the rank
     * of the group of cards played and the cards on the board
     * 
     * @param g - group of cards
     * @return - Same ranked cards return 0,
     * Higher ranked cards return positive,
     * Lower ranked cards return negative
     */
    @Override
    public int compareTo(GroupOfCards g) {
                
        Hand c = (Hand)g;
        int result = 0;
        
        if ((c == null) || c.isEmpty()) {
            throw new IllegalArgumentException("Error: Empty Hand");
        }
        
        return result = this.get(0).compareTo(c.get(0));

    }
    
    /**
     * Displays the string representation of the last group of cards played. 
     * 
     * @return String - cards on board displayed to the user, so they know
     * what can be played.
     */
    @Override
    public String toString() {
        String tempStr = "";
        for (PresidentCard c: this)
            tempStr = c.shortString() + " ";
        return tempStr;
    }
    
}
