package ca.sheridancollege.project.model;
import ca.sheridancollege.project.model.Card;
import java.util.ArrayList;

/**
 * This class models a Hand of Cards. A Hand of Cards is owned by a single
 * Player and contains the number of cards in the Deck divided by the number
 * of players. 
 * 
 * @author Daniel Minami
 */
public class Hand extends GroupOfCards {
    
    public static final int HAND_SIZE_PRESIDENT = 13;
    
    public Hand() {
        super(HAND_SIZE_PRESIDENT);
    }

    /** 
     * Constructs a Hand object with 13 Cards (defined by the constant
     * HAND_SIZE_PRESIDENT). Accepts a Deck and pop's 13 Cards from it and
     * add to the Hand.
     * 
     * @param deck Deck of Cards after being shuffled
     */    
    public Hand(Deck deck) {
        super(HAND_SIZE_PRESIDENT);
        int temp;
        for (int i = 0; i < HAND_SIZE_PRESIDENT; i++) {
            temp = (int)Math.floor(Math.random()* deck.size());
            this.add(deck.get(temp));
            deck.remove(temp);
        }
    }
    
    /**
     * Removes a list of cards from the Hand.
     * 
     * @param cardsToRemove List of Cards to be remove from the Hand
     */
    public void removeFromHand(ArrayList<PresidentCard> cardsToRemove) {
        for (PresidentCard c: cardsToRemove)
            this.remove(c);
    }

    
    /**
     * This method compares the Cards the Player are trying to play and returns
     * the result of the comparison
     * 
     * @param g Group of cards to be compared
     * @return 0 if the Cards have the same rank
     * 1 if the Card have higher rank
     * -1 if the Card have lower rank
     */
    @Override
    public int compareTo(GroupOfCards g) {

        Hand c = (Hand)g;
        int result = 0;
        
        if ((g == null) || g.isEmpty()) {
            throw new IllegalArgumentException("Error: Empty Hand");
        }
                
        if (c.size() == 1)
            return result;
        

        if (c.size() == 2){
            return result = c.get(0).compareTo(c.get(1));
        }
        
        if (c.size() == 3) {
            result = c.get(0).compareTo(c.get(1));
            result += c.get(0).compareTo(c.get(2));
            result += c.get(1).compareTo(c.get(2));
            return result;
        }
            
        if (c.size() == 4) {
            result = c.get(0).compareTo(c.get(1));
            result += c.get(0).compareTo(c.get(2));
            result += c.get(0).compareTo(c.get(3));
            result += c.get(1).compareTo(c.get(2));
            result += c.get(1).compareTo(c.get(3));
            result += c.get(2).compareTo(c.get(3));
            return result;
        } else {
            throw new IllegalArgumentException("Error: Maximum allowed cards "
                    + "are 4 for each turn");
            
        }
        
    }
    
}
