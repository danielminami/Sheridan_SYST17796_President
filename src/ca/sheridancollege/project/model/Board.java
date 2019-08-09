package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card;
import java.util.ArrayList;

/**
 *
 * @author Daniel Minami
 */
public class Board extends GroupOfCards {

    public static final int DECK_SIZE_PRESIDENT = 52;
    
    public Board () {
        super(DECK_SIZE_PRESIDENT);
    }
    
    public boolean moveAllowed(GroupOfCards g){
        Hand c = (Hand)g;
        if (this.get(0).compareTo(c.get(0)) <= 0)
            return true;
        return false;
    }
    
    @Override
    public int compareTo(GroupOfCards g) {
                
        Hand c = (Hand)g;
        int result = 0;
        
        if ((c == null) || c.isEmpty()) {
            throw new IllegalArgumentException("Error: Empty Hand");
        }
        
        return result = this.get(0).compareTo(c.get(0));

    }
    
    @Override
    public String toString() {
        String tempStr = "";
        for (PresidentCard c: this)
            tempStr = c.shortString() + " ";
        return tempStr;
    }
    
}
