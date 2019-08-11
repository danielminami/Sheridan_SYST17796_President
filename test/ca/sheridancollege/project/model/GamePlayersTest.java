/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stuar
 */
public class GamePlayersTest {
    
    public GamePlayersTest() {
    }
     
   @Test
   public void testnotEmptyBoundary(){
       System.out.println("Alternate Path1 - Checking for empty player name - Boundary Test");
       String name = " ";
       boolean expResult = false;
       boolean result = GamePlayers.notEmpty(name);
       assertEquals(expResult, result);
   }
   
   @Test
   public void testnotEmptyBad(){
       System.out.println("Alternate Path1 - Checking for empty player name - Bad Test");
       String name = "";
       boolean expResult = false;
       boolean result = GamePlayers.notEmpty(name);
       assertEquals(expResult, result);
   }
  
   @Test
   public void testnotEmptyGood(){
       System.out.println("Alternate Path1 - Checking for empty player name - Good Test");
       String name = "anything";
       boolean expResult = true;
       boolean result = GamePlayers.notEmpty(name);
       assertEquals(expResult, result);
   }
   
   @Test 
   public void testisSameNameBoundary(){
       System.out.println("Alternate Path2 - Checking for duplicate player name - Boundary Test");
       Player p1 = new Player ("one");
       Player p2 = new Player ("one ");
       GamePlayers sample = new GamePlayers();
       sample.add(p1);
       boolean expResult = true;
       boolean result = sample.isSameName(p2.getName());
       assertEquals(expResult, result);
   }
  
   @Test 
   public void testisSameNameBad(){
       System.out.println("Alternate Path2 - Checking for duplicate player name - Bad Test");
       Player p1 = new Player ("one");
       Player p2 = new Player ("one");
       GamePlayers sample = new GamePlayers();
       sample.add(p1);
       boolean expResult = true;
       boolean result = sample.isSameName(p2.getName());
       assertEquals(expResult, result);
   }
   
   @Test 
   public void testisSameNameGood(){
       System.out.println("Alternate Path2 - Checking for duplicate player name - Good Test");
       Player p1 = new Player ("one");
       Player p2 = new Player ("two");
       GamePlayers sample = new GamePlayers();
       sample.add(p1);
       boolean expResult = false;
       boolean result = sample.isSameName(p2.getName());
       assertEquals(expResult, result);
   }
   
   /*
   @Test
   public void testnotSameName(){
       System.out.println("setGamePlayer Same");
       String name1 = "same";
       String name2 = "same";
       Player p1 = new Player("same");
       
       GamePlayers.add(p1);
       boolean expResult = false;
       
   }
   */
 
    /**
     * Test of setGamePlayer method, of class GamePlayers.
     */
   /*
    @Test
    public void testSetGamePlayer() {
        System.out.println("setGamePlayer");
        Player p = null;
        GamePlayers instance = new GamePlayers();
        instance.setGamePlayer(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}