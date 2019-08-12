package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 * This class models a StandardCard. A StandardCard is a Card
 * with an specific ranks and suits and can be used in any Standard Game
 * card game.
 * 
 * @author Daniel Minami
 * @author Stuart Bollinger
 * @author Muaz Ahmed
 */
public class Turn {
    private Player player;
    private boolean isActive = true;
    
    /**
     * Constructs an object Turn with a player
     * 
     * @param player that will play this Turn
     */
    public Turn (Player player) {
        setPlayer(player);
    }
    
    /**
     * This method plays this turn. The player makes the move and try to place
     * the Cards in the current board. If the movement is allowed, the turn 
     * is made inactive and the board is populated with the player's move, 
     * otherwise, an exception is thrown.
     * 
     * @param playerMoves player cards selection
     * @param board current board game
     */
    public void playTurn(ArrayList<Integer> playerMoves, Board board)  {
        Hand tempHand = new Hand();
        for (Integer i: playerMoves){       
            tempHand.add(player.getHand().get(i));
        }
        
        //valid hand selection
        if (tempHand.compareTo(tempHand) == 0) {
            //case board is empty
            if ((board == null) || board.isEmpty()) {
                //fill the board with the Hand's content
                for(PresidentCard c: tempHand)
                    board.add(c);
                //remove the cards from the players hand
                player.getHand().removeFromHand(tempHand);
            } else if (board.size() == tempHand.size()) {
                if (board.moveAllowed(tempHand)) {
                    board.clear();
                    for (PresidentCard c: tempHand)
                        board.add(c);
                    player.getHand().removeFromHand(tempHand);
                } else {
                    throw new IllegalArgumentException("Error: You have to play"
                            + " cards within the same length as the board and"
                            + " greater Rank.");
                }
            } else {
                throw new IllegalArgumentException("Error: Invalid number "
                        + "of cards selected");
            }
            
        } else {
            throw new IllegalArgumentException("Error: to play more than "
                    + "one card, they must be equals and match the current "
                    + "board length.");
        }
        
       
    }
    
    /**
     * Passed the turn. The player cannot pass if they are the previous Trick
     * winner.
     * 
     * @param board current board
     * @return true if the player can pass false otherwise
     */
    public boolean passTurn(Board board) {
        return board.isEmpty();
    }

    /**
     * Accessor to the field player
     * 
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Mutator to the field player
     * 
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Accessor to the field isActive
     * 
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Mutator to the field isActive
     * 
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
