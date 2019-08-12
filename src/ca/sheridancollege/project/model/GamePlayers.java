
package ca.sheridancollege.project.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Minami
 */
public class GamePlayers extends ArrayList<Player> {
    
    boolean validName = true;
    int playerNumber = 1;
    String playerName = "";
    Scanner in;
    
    public GamePlayers() {}
    
    public static boolean notEmpty(String name){
        
        boolean isLegit = false;
        if (!name.trim().isEmpty())
            isLegit = true;
        return isLegit;
    }

    
    
    public boolean isSameName(String name){
        
        boolean isSame = false;
        for (int i = 0; i < this.size(); i++) {
            if (name.trim().equals(this.get(i).getName())) {
                isSame = true;
            }
        }
        return isSame;
    }
    
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
