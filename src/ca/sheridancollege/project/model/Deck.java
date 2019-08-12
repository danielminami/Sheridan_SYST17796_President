package ca.sheridancollege.project.model;


import java.util.Random;

/**
 *  This class models the Deck, which is a Group of Cards. A Deck contains
 * 52 Cards defined by the constant DECK_SIZE_PRESIDENT.
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class Deck extends GroupOfCards {

    public static final int DECK_SIZE_PRESIDENT = 52;
    
    /**
     * Constructs a Deck object with capacity of 52 Cards defined in the 
     * constant DECK_SIZE_PRESIDENT
     */
    public Deck() {
        super(DECK_SIZE_PRESIDENT);
        init();
    }
    
    /**
     * This creates 52 unique Cards and add them into the Deck
     */
    private void init() {

        int i = 0;
        
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()){
                PresidentCard c = new PresidentCard(r, s);
                this.add(c);
            }
        }
    }
    
    /**
     * This accepts a Deck and shuffles the Cards into a random order.
     * 
     * @param deckOfCards is a 52 PresidentCards Array
    */
    public void shuffleDeck(Deck deckOfCards) {
 
        Random rgen = new Random();
        Deck tempArrayL = new Deck();
        
	for (int i=0; i < this.size(); i++) {    
            int randomPosition = rgen.nextInt(this.size());
	    tempArrayL.add(this.get(randomPosition));
	}
        
        this.clear();
        this.addAll(tempArrayL);
    }

    
    /**
     * This method is not being used in this Class.
     * 
     * @param o accepts a group of Cards
     * @return returns a Exception while the method is not implemented.
     */
    
    @Override
    public int compareTo(GroupOfCards o) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
