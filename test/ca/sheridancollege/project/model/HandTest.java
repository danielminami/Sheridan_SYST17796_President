package ca.sheridancollege.project.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Minami
 */
public class HandTest {
    
    public HandTest() {
    }

    /**
     * Alternate path #5
     * 1. Player registers for the game
     * 2. Game provides cards to players
     * 3. Player tries to play doubles with Cards of different Rank
     * 4. Shows error message
     * 5. Asks the user to enter a valid set of cards
     * 6. Return to step 3 looking for valid set of cards
     * 
     * This is the Good test, when user plays a valid selection
     * 
     */
    @Test
    public void testCompareToGood() {
        boolean expResult = true;
        boolean result = false;        
        Hand hand = new Hand();
        PresidentCard c1 = new PresidentCard(Rank.THREE, Suit.CLUBS);
        PresidentCard c2 = new PresidentCard(Rank.THREE, Suit.DIAMOND);
        
        System.out.println("Alternate Path5 - Checking for invalid pairs "
                + "- Good Test");

        hand.add(c1);
        hand.add(c2);
        
        if (hand.compareTo(hand) == 0) {
            result = true;
        } else {
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
    /**
     * Alternate path #5
     * 1. Player registers for the game
     * 2. Game provides cards to players
     * 3. Player tries to play doubles with Cards of different Rank
     * 4. Shows error message
     * 5. Asks the user to enter a valid set of cards
     * 6. Return to step 3 looking for valid set of cards
     * 
     * This is the Bad test, when user plays a valid selection
     * 
     */
    @Test
    public void testCompareToBad() {
        boolean expResult = false;
        boolean result = false;        
        Hand hand = new Hand();
        PresidentCard c1 = new PresidentCard(Rank.KING, Suit.CLUBS);
        PresidentCard c2 = new PresidentCard(Rank.THREE, Suit.DIAMOND);
        
        System.out.println("Alternate Path5 - Checking for invalid pairs "
                + "- Bad Test");

        hand.add(c1);
        hand.add(c2);
        
        if (hand.compareTo(hand) == 0) {
            result = true;
        } else {
            result = false;
        }
        
        assertEquals(expResult, result);
    }

    /**
     * Alternate path #5
     * 1. Player registers for the game
     * 2. Game provides cards to players
     * 3. Player tries to play doubles with Cards of different Rank
     * 4. Shows error message
     * 5. Asks the user to enter a valid set of cards
     * 6. Return to step 3 looking for valid set of cards
     * 
     * This is the Boundary test, when user plays a valid selection
     * 
     */
    @Test
    public void testCompareToBoundary() {
        boolean expResult = true;
        boolean result = false;        
        Hand hand = new Hand();
        PresidentCard c1 = new PresidentCard(Rank.THREE, Suit.CLUBS);
        PresidentCard c2 = new PresidentCard(Rank.THREE, Suit.DIAMOND);
        PresidentCard c3 = new PresidentCard(Rank.THREE, Suit.HEARTS);
        PresidentCard c4 = new PresidentCard(Rank.THREE, Suit.SPADES);
        
        System.out.println("Alternate Path5 - Checking for invalid pairs "
                + "- Boundary Test");

        hand.add(c1);
        hand.add(c2);
        hand.add(c3);
        hand.add(c4);
        
        if (hand.compareTo(hand) == 0) {
            result = true;
        } else {
            result = false;
        }
        
        assertEquals(expResult, result);
    }
        
    
}
