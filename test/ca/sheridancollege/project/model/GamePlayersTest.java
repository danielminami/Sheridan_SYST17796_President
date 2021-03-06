package ca.sheridancollege.project.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Minami
 */
public class GamePlayersTest {

    public GamePlayersTest() {
    }

    /**
     * Alternate Path #1 1. Player registers for the game 2. Player sets an
     * empty name 3. Shows error message 4. Asks the user to enter the name
     * again 5. Return to step 1
     *
     * This is the Boundary test, when user enters an empty name
     */
    @Test
    public void testnotEmptyBoundary() {
        System.out.println("Alternate Path1 - Checking for empty player name "
                + "- Boundary Test");
        String name = " ";
        boolean expResult = false;
        boolean result = GamePlayers.notEmpty(name);
        assertEquals(expResult, result);
    }

    /**
     * Alternate Path #1 1. Player registers for the game 2. Player sets an
     * empty name 3. Shows error message 4. Asks the user to enter the name
     * again 5. Return to step 1
     *
     * This is the Bad test, when user enters an empty name
     */
    @Test
    public void testnotEmptyBad() {
        System.out.println("Alternate Path1 - Checking for empty player name "
                + "- Bad Test");
        String name = "";
        boolean expResult = false;
        boolean result = GamePlayers.notEmpty(name);
        assertEquals(expResult, result);
    }

    /**
     * Alternate Path #1 1. Player registers for the game 2. Player sets an
     * empty name 3. Shows error message 4. Asks the user to enter the name
     * again 5. Return to step 1
     *
     * This is the Good test, when user enters an empty name
     */
    @Test
    public void testnotEmptyGood() {
        System.out.println("Alternate Path1 - Checking for empty player name "
                + "- Good Test");
        String name = "anything";
        boolean expResult = true;
        boolean result = GamePlayers.notEmpty(name);
        assertEquals(expResult, result);
    }

    /**
     * Alternate Path #2 1. Player registers for the game 2. Player sets the
     * same name to a previous registered Player 3. Show error message 4. Asks
     * the user to enter the name again 5. Returns to step 1
     *
     * This is the Boundary test, when a user enters an existing name
     */
    @Test
    public void testisSameNameBoundary() {
        System.out.println("Alternate Path2 - Checking for duplicate player"
                + " name - Boundary Test");
        Player p1 = new Player("one");
        Player p2 = new Player("two");
        Player p3 = new Player("three");
        Player p4 = new Player("one");
        GamePlayers sample = new GamePlayers();
        sample.add(p1);
        sample.add(p2);
        sample.add(p3);
        boolean expResult = true;
        boolean result = sample.isSameName(p4.getName());
        assertEquals(expResult, result);
    }

    /**
     * Alternate Path #2 1. Player registers for the game 2. Player sets the
     * same name to a previous registered Player 3. Show error message 4. Asks
     * the user to enter the name again 5. Returns to step 1
     *
     * This is the Bad test, when a user enters an existing name
     */
    @Test
    public void testisSameNameBad() {
        System.out.println("Alternate Path2 - Checking for duplicate player "
                + "name - Bad Test");
        Player p1 = new Player("one");
        Player p2 = new Player("one");
        GamePlayers sample = new GamePlayers();
        sample.add(p1);
        boolean expResult = true;
        boolean result = sample.isSameName(p2.getName());
        assertEquals(expResult, result);
    }

    /**
     * Alternate Path #2 1. Player registers for the game 2. Player sets the
     * same name to a previous registered Player 3. Show error message 4. Asks
     * the user to enter the name again 5. Returns to step 1
     *
     * This is the Good test, when a user enters an existing name
     */
    @Test
    public void testisSameNameGood() {
        System.out.println("Alternate Path2 - Checking for duplicate player "
                + "name - Good Test");
        Player p1 = new Player("one");
        Player p2 = new Player("two");
        GamePlayers sample = new GamePlayers();
        sample.add(p1);
        boolean expResult = false;
        boolean result = sample.isSameName(p2.getName());
        assertEquals(expResult, result);
    }

}
