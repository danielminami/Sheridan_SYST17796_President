package ca.sheridancollege.project.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Minami
 */
public class TurnTest {
    
    public TurnTest() {
    }
    

    /**
     * Alternate path #4
     *   1. Player registers for the game
     *   2. Game provides cards to players
     *   3. Player passes the turn in the first Game turn
     *   4. Shows error message
     *   5. Asks the user to enter the set of cards again
     *   6. Return to step 3 looking for valid set of cards
     * 
     * This is the Bad test, when user plays a valid selection
     * 
     */
    @Test
    public void testPlayTurnBad() {
        boolean expResult = false;
        boolean result = false;        
        Board board = new Board();
        Player player = new Player();
        Deck deck = new Deck();
        Hand hand = new Hand(deck);
        player.setHand(hand);
        Turn turn = new Turn(player);

        System.out.println("Alternate Path4 - Checking for pass in first Turn "
                + "- Bad Test");
        
        result = !turn.passTurn(board);
        
        assertEquals(expResult, result);
    }    

    /**
     * Alternate path #4
     *   1. Player registers for the game
     *   2. Game provides cards to players
     *   3. Player passes the turn in the first Game turn
     *   4. Shows error message
     *   5. Asks the user to enter the set of cards again
     *   6. Return to step 3 looking for valid set of cards
     * 
     * This is the Good test, when user plays a valid selection
     * 
     */
    @Test
    public void testPlayTurnGood() {
        boolean expResult = true;
        boolean result = false;        
        Board board = new Board();
        Player player = new Player();
        Deck deck = new Deck();
        Hand hand = new Hand(deck);
        player.setHand(hand);
        Turn turn = new Turn(player);
        board.add(player.getHand().get(0));

        System.out.println("Alternate Path4 - Checking for pass in first Turn "
                + "- Good Test");
        
        result = !turn.passTurn(board);
        
        assertEquals(expResult, result);
    }    
    
    /**
     * Alternate path #4
     * 
     * In this case Boundary test is not applicable.
     * 
     */
    
}
