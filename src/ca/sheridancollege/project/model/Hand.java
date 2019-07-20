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
public class Hand extends GroupOfCards {
    
    /*Composition version
    private ArrayList<Card> playerHand;
    private Player player;
    */

    public static final int HAND_SIZE_PRESIDENT = 13;
    
    public Hand() {
        super(HAND_SIZE_PRESIDENT);
    }
    
    public Hand(Deck deck) {
        super(HAND_SIZE_PRESIDENT);
        int temp;
        for (int i = 0; i < HAND_SIZE_PRESIDENT; i++) {
            temp = (int)Math.floor(Math.random()* deck.size());
            this.add(deck.get(temp));
            deck.remove(temp);
        }
    }
    
    public void removeFromHand(ArrayList<PresidentCard> cardsToRemove) {
        for (PresidentCard c: cardsToRemove)
            this.remove(c);
    }

    @Override
    public int compareTo(GroupOfCards g) {

        Hand c = (Hand)g;
        int result = 0;
        
        if ((g == null) || g.isEmpty()) {
            throw new IllegalArgumentException("Error: Empty Hand");
        }
        
        if (c.size() == 1)
            return result;
        

        if (c.size() == 2){
            return result = c.get(0).compareTo(c.get(1));
        }
        
        if (c.size() == 3) {
            result = c.get(0).compareTo(c.get(1));
            result += c.get(0).compareTo(c.get(2));
            result += c.get(1).compareTo(c.get(2));
            return result;
        }
            
        if (c.size() == 4) {
            result = c.get(0).compareTo(c.get(1));
            result += c.get(0).compareTo(c.get(2));
            result += c.get(0).compareTo(c.get(3));
            result += c.get(1).compareTo(c.get(2));
            result += c.get(1).compareTo(c.get(3));
            result += c.get(2).compareTo(c.get(3));
            return result;
        } else {
            throw new IllegalArgumentException("Error: Maximum allowed cards "
                    + "are 4 for each turn");
            
        }    
    }
    
}
