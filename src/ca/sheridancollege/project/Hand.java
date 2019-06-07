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
public class Hand extends GroupOfCards {
    
    //Use the method ArrayList<Card>.subList((int fromIndex, int toIndex)
    private ArrayList<Card> playerHand;
    private Player player;
    public static final int HAND_SIZE_PRESIDENT = 13;
    
    public Hand () {
        super(HAND_SIZE_PRESIDENT);
    }

    
    public void removeFromHand(ArrayList<Card> cardsToRemove) {}
    
}
