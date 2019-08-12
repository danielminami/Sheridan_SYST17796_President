/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.model;

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
       Player p2 = new Player ("two");
       Player p3 = new Player ("three");
       Player p4 = new Player ("one");
       GamePlayers sample = new GamePlayers();
       sample.add(p1);
       sample.add(p2);
       sample.add(p3);
       boolean expResult = true;
       boolean result = sample.isSameName(p4.getName());
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
   
}