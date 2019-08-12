package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 * This class models a GroupOfCards. 
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */

public abstract class GroupOfCards 
        extends ArrayList<PresidentCard> 
        implements Comparable<GroupOfCards>{

    /**
     * Constructs a group of Cards with a given length
     * 
     * @param lenght GroupOfCards size
     */
    public GroupOfCards (int lenght){
        super(lenght);
    }
    
    public abstract int compareTo(GroupOfCards o);
    
}
