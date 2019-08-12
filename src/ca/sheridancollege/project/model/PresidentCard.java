package ca.sheridancollege.project.model;

/**
 * This class models a PresidentCard. A President Card is a StandardCard
 * with an specific comparison method, designed for this game.
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class PresidentCard extends StandardCard {
    
    /**
     * Constructs a Card buy assigning a Rank and a Suit
     * 
     * @param rank Enum of ranks
     * @param suit Enum of Suits
     */
    public PresidentCard(Rank rank, Suit suit) {
        super(rank, suit);
    }
    
    
    /**
     * This method compares this Card to a given card and returns the result
     * 
     * @param c A generic type of Card
     * @return 0 if the Cards have the same rank
     * 1 if this Card has higher rank
     * -1 if the given Card has higher rank
     */
    @Override
    public int compareTo(Card c) {
        
        PresidentCard o = (PresidentCard)c;
        
        if (this == o)
            return 0;
        if (this.getRank().getRankValue() > o.getRank().getRankValue()) {
            return 1;
        } else if (this.getRank().getRankValue() < o.getRank().getRankValue()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
