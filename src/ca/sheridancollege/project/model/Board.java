/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public boolean moveAllowed(PresidentCard card){
        if (this.get(0).compareTo(card) >= 0)
            return true;
        return false;
    }
    
    public boolean moveAllowed(ArrayList<PresidentCard> cards){
        return false;
    }

    @Override
    public int compareTo(GroupOfCards o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        String tempStr = "";
        for (PresidentCard c: this)
            tempStr = c.shortString() + " ";
        return tempStr;
    }
    
}
