
package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Minami
 */
public class GamePlayers extends ArrayList<Player> {
    
    
    public GamePlayers() {}
    
    public GamePlayers(Player p1, Player p2, Player p3, Player p4) {
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
    }
    
}
