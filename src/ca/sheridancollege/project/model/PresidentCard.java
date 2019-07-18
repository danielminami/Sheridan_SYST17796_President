package ca.sheridancollege.project.model;

/**
 *
 * @author Daniel Minami
 */
public class PresidentCard extends StandardCard {
    
    public PresidentCard(Rank rank, Suit suit) {
        super(rank, suit);
    }
    
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
