package ca.sheridancollege.project;

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
    
    private void init() {

        int i = 0;
        
        for (Suits s : Suits.values()) {
            for (Rank r : Rank.values()){
                Card c = new Card(r, s);
                cards[i++] = c;
            }
        }
    }
    
    public void dealCards() {
    
        // Implement method to fill the players hands.
    
    }
    
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
    
    @Override
    public String toString() {
        //stub
        return "stub";
    }
    
}
