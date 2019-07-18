package ca.sheridancollege.project.model;

//import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Daniel Minami
 */
public class Deck extends GroupOfCards {

    public static final int DECK_SIZE_PRESIDENT = 52;
    
    public Deck() {
        super(DECK_SIZE_PRESIDENT);
        init();
    }
    
    /*Composition Version
    
    private void init() {

        int i = 0;
        
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()){
                Card c = new Card(r, s);
                cards[i++] = c;
            }
        }
    }
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
    
    public void dealCards() {
    
        // Implement method to fill the players hands.
    
    }
    
    
    /*Composition Version
    public Deck shuffleDeck(Deck deckOfCards) {
 
        Random rgen = new Random();
        
	for (int i=0; i<deckOfCards.cards.length; i++) {    
            int randomPosition = rgen.nextInt(deckOfCards.cards.length);
	    Card temp = deckOfCards.cards[i];
            deckOfCards.cards[i] = deckOfCards.cards[randomPosition];
	    deckOfCards.cards[randomPosition] = temp;
	}

        return deckOfCards;
    }
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
    
    @Override
    public String toString() {
        //stub
        return "stub";
    }

    @Override
    public int compareTo(GroupOfCards o) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
