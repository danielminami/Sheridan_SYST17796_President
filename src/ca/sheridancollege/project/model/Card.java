package ca.sheridancollege.project.model;

/**
 *  This class models the abstract Class card. The Card is a parent Class of 
 * various types of Cards.
 * 
 * @author Daniel Minami
 */
public abstract class Card implements Comparable<Card>{

    public abstract String toString();
    
    public abstract String shortString(); 
    
    public abstract boolean equals(Object obj); 

    public abstract int compareTo(Card o);
    
}
