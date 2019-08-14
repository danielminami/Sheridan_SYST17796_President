/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Minami
 */
public class BoardTest {
    
    public BoardTest() {
    }

    /**
     * Alternate path #3
     * 1. Player registers for the game
     * 2. Game provides cards to players
     * 3. Player plays an invalid selection of a card
     * 4. Shows error message
     * 5. Asks the user to enter the set of cards again
     * 6. Return to step 3 looking for valid set of cards
     * 
     * This is the Good test, when user plays a valid selection
     * 
     */
    @Test
    public void testMoveAllowedGood() {
        boolean expResult = true;
        boolean result = false;        
        Board board = new Board();
        Hand hand = new Hand();
        PresidentCard cBoard = new PresidentCard(Rank.SIX, Suit.CLUBS);
        PresidentCard pMove = new PresidentCard(Rank.SEVEN, Suit.CLUBS);
        
        System.out.println("Alternate Path3 - Checking for invalid move "
                + "- Good Test");

        board.add(cBoard);
        hand.add(pMove);
        
        result = board.moveAllowed(hand); 
        assertEquals(expResult, result);
    }


    /**
     * Alternate path #3
     * 1. Player registers for the game
     * 2. Game provides cards to players
     * 3. Player plays an invalid selection of a card
     * 4. Shows error message
     * 5. Asks the user to enter the set of cards again
     * 6. Return to step 3 looking for valid set of cards
     * 
     * This is the Bad test, when user plays a valid selection
     * 
     */
    @Test
    public void testMoveAllowedBad() {
        boolean expResult = false;
        boolean result = false;        
        Board board = new Board();
        Hand hand = new Hand();
        PresidentCard cBoard = new PresidentCard(Rank.SIX, Suit.CLUBS);
        PresidentCard pMove = new PresidentCard(Rank.FOUR, Suit.CLUBS);
        
        System.out.println("Alternate Path3 - Checking for invalid move "
                + "- Bad Test");

        board.add(cBoard);
        hand.add(pMove);
        
        result = board.moveAllowed(hand);
      
        assertEquals(expResult, result);
    }

    /**
     * Alternate path #3
     * 1. Player registers for the game
     * 2. Game provides cards to players
     * 3. Player plays an invalid selection of a card
     * 4. Shows error message
     * 5. Asks the user to enter the set of cards again
     * 6. Return to step 3 looking for valid set of cards
     * 
     * This is the Boundary test, when user plays a valid selection
     * 
     */
    @Test
    public void testMoveAllowedBoundary() {
        boolean expResult = true;
        boolean result = false;        
        Board board = new Board();
        Hand hand = new Hand();
        PresidentCard cBoard = new PresidentCard(Rank.THREE, Suit.CLUBS);
        PresidentCard pMove = new PresidentCard(Rank.TWO, Suit.CLUBS);
        
        System.out.println("Alternate Path3 - Checking for invalid move "
                + "- Boundary Test");

        board.add(cBoard);
        hand.add(pMove);
        
        result = board.moveAllowed(hand);
      
        assertEquals(expResult, result);
    }
    
}
