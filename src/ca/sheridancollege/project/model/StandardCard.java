package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card;

/**
 *
 * @author Daniel Minami
 */
public class StandardCard extends Card {
    
    private Rank rank;
    private Suit suit;

    public StandardCard() {}

    public StandardCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank.getRankLongName(), 
                this.suit.getSuitName());
    }
    
    /**
     * 
     * 
     * @return short String of the card
     */
    @Override
    public String shortString() {
    
        return String.format("%s%c", this.rank.getRankShortName(), 
                this.suit.getSuitSymbol());
    }
    
    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (obj instanceof Card) {
            StandardCard card = (StandardCard) obj;
            if (this.getRank() == card.getRank()
                    && this.getSuit() == card.getSuit()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int compareTo(Card o) {
        //stub
        return 0;
    }
}
