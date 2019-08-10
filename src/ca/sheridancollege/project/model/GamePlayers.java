
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
    
    public GamePlayers(Player p1, Player p2, Player p3, Player p4) {
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
    }
     public void setGamePlayer (Player p){
    
        validName = true;
        playerName = p.getName();           
        if (playerName.trim().isEmpty()) {             
            validName = false;
            throw new IllegalArgumentException("Error: Cannot have empty"
                    + " player name.");       
        } else {
            if (playerNumber == 1) {
                this.add(p);
                playerNumber++;
            } else {
                for (int i = 0; i < this.size(); i++) {
                    if (playerName.trim().equals(this.get(i).getName())){
                        validName = false;
                        throw new IllegalArgumentException("Error: Cannot have"
                                + " duplicate player name.");
                    }
                }
                if (validName) {
                    this.add(p);
                    playerNumber++;
                }
            }
        }
    }
}
