package ca.sheridancollege.project.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  This class models an array of Players, to control the users registered in 
 * a particular game.
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class GamePlayers extends ArrayList<Player> {
    
    boolean validName = true;
    int playerNumber = 1;
    String playerName = "";
    Scanner in;
    
    public GamePlayers() {}
    
    
    /**
     * Accepts a string and checks if it is empty or not.
     * 
     * @param name - String variable tested for empty.
     * @return boolean - True if name is not empty, false if name is empty.
     */
    public static boolean notEmpty(String name){
        
        boolean isLegit = false;
        if (!name.trim().isEmpty())
            isLegit = true;
        return isLegit;
    }

    
    /**
     * Accepts a String and checks if any other players in the GamePlayer array
     * have the same name.
     * 
     * @param name - String variable tested for duplicates
     * @return - True if name is duplicate, false if name is unique.
     */
    public boolean isSameName(String name){
        
        boolean isSame = false;
        for (int i = 0; i < this.size(); i++) {
            if (name.trim().equals(this.get(i).getName())) {
                isSame = true;
            }
        }
        return isSame;
    }
    
    /**
     * If the name of the player object passed as argument is not empty, 
     * and is not a duplicate of any other players in the GamePlayer array,
     * Then add the player to GamePlayer array.
     * 
     * @param p - Player to be added to the GamePlayer array.
     */
    public void setGamePlayer(Player p){
        
        if (notEmpty(p.getName())) {
            if (!isSameName(p.getName())) {
                this.add(p);               
            } else {
                throw new IllegalArgumentException("Erro: Players cannot "
                        + "have same names.");
            }
        } else {
            throw new IllegalArgumentException("Error: Player name cannot "
                    + "be empty.");
        }
        
    }
   
}
