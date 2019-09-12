package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card;

/**
 * This class models a StandardCard. A StandardCard is a Card
 * with an specific ranks and suits and can be used in any Standard Game
 * card game.
 * 
 * @author Daniel Minami
 */
public class StandardCard extends Card {
    
    private Rank rank;
    private Suit suit;

    /**
     * Constructs a empty StandardCard object
     */
    public StandardCard() {}

    /**
     * Constructs a StandardCard object using the given Enum values
     * 
     * @param rank the card rank value
     * @param suit the card suit
     */
    public StandardCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Accessor for rank
     * 
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Mutator for rank
     * 
     * @param rank the rank to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * Accessor for suit
     * 
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Mutator for suit
     * 
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * String representation of the Card
     * 
     * @return a string representation of the Card
     */
    @Override
    public String toString() {
        return String.format("%s of %s", this.rank.getRankLongName(), 
                this.suit.getSuitName());
    }
    
    /**
     * Short String representation of the Card
     * 
     * @return short String of the card
     */
    @Override
    public String shortString() {
    
        return String.format("%s%c", this.rank.getRankShortName(), 
                this.suit.getSuitSymbol());
    }
    
    
    /**
     * This method compares this Card to a Given Card.
     * 
     * @param obj a StandardCard
     * @return true if the Cards are equal
     * false if the Cards are different
     */
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

    /**
     * This method is not implemented here but in the PresidentCard.
     * 
     * @param o is a Card
     * @return 0 for same card Rank.
     */
    public int compareTo(Card o) {
        //stub
        return 0;
    }
}
