package ca.sheridancollege.project;

/**
 *
 * @author Daniel Minami
 */
public class Card {

    private Rank rank;
    private Suits suit;

    public Card() {}

    public Card(Rank rank, Suits suit) {
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
    public Suits getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank.getRankLongName(), this.suit.getSuitName());
    }
    
    /**
     * 
     * 
     * @return short String of the card
     */
    public String shortString() {
    
        return String.format("%s%c", this.rank.getRankShortName(), this.suit.getSuitSymbol());
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
            Card card = (Card) obj;
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

}
