package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Minami
 */

/*Composition class declaration
public class GroupOfCards {
*/
public abstract class GroupOfCards 
        extends ArrayList<PresidentCard> 
        implements Comparable<GroupOfCards>{

    
    /* Composition version
    Card cards[];
    
    public GroupOfCards (int lenght){
        cards = new Card[lenght];
    }
    */
    public GroupOfCards (int lenght){
        super(lenght);
    }

    public abstract int compareTo(GroupOfCards o);
    
}
