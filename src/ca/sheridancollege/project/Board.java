/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Daniel Minami
 */
public class Board extends GroupOfCards {

    private Card lastPlayed;
    public static final int DECK_SIZE_PRESIDENT = 52;
    
    public Board () {
        super(DECK_SIZE_PRESIDENT);
    }
    
}
