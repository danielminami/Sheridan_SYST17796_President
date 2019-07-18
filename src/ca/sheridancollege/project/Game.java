package ca.sheridancollege.project;

import ca.sheridancollege.project.model.Board;
import ca.sheridancollege.project.model.Deck;
import ca.sheridancollege.project.model.Player;
import ca.sheridancollege.project.model.GamePlayers;
import ca.sheridancollege.project.model.Hand;
import ca.sheridancollege.project.model.PresidentCard;
import ca.sheridancollege.project.model.Round;
import ca.sheridancollege.project.model.Trick;
import ca.sheridancollege.project.model.Turn;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Minami
 */
public class Game {
    
       
    public static void main(String[] args){
    
        int playerNumber = 1;
        String playerName = "";
        Scanner in;
        GamePlayers gamePlayers = new GamePlayers();
        Deck deck = new Deck();
        Board board = new Board();
        Round round = new Round();
        int playerTurn = 99;
        
        /*Getting the Player names and adding to the gamePlayers obj*/
        do {
            try {
                System.out.println("Enter the name of Player " + 
                        playerNumber + ": ");
                in = new Scanner(System.in);
                playerName = in.nextLine();
                Player p = new Player (playerName);
                gamePlayers.add(p);
                playerNumber++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (playerNumber <= 4);
        
        deck.shuffleDeck(deck);
        
        for (Player p: gamePlayers) {
            Hand hand = new Hand(deck);
            p.setHand(hand);
        }
            
        for (Player p: gamePlayers) {
            System.out.println(p);
        }
        
        do {
            Trick trick = new Trick();
            if (playerTurn == 99)
                playerTurn = 0;
            
            do {
                Turn turn = new Turn(gamePlayers.get(playerTurn));
                String playerEntry = "";
                ArrayList<Integer> playerMove = new ArrayList();
                /*Getting the Player movement*/
                do {
                    try {
                        System.out.println("Enter 'p' to pass or type the "
                                + "card(s) index(es), separating by comma: ");
                        
                        //stub - Prints the hand with indexes
                        
                        in = new Scanner(System.in);
                        playerEntry = in.nextLine();
                        if (playerEntry.equals("p")){
                            //when user pass
                        } else {
                            //when users play
                            
                            //placing the users entry in a int Array
                            int nextIndex = 0;
                            for (int i = 0; i < playerEntry.length(); i++) {
                                if (playerEntry.charAt(i) == ',') {
                                    playerMove.add(Integer.parseInt(playerEntry.subSequence(nextIndex, i-1).toString()));
                                    nextIndex = i+1;
                                }
                            }
                            
                            turn.playTurn(playerMove, board);
                            
                            
                        }
                        Player p = new Player (playerName);
                        gamePlayers.add(p);
                        playerNumber++;
                    } catch (Exception e) {
                        System.out.println("Invalid Movement.");
                    }
                } while (playerNumber <= 4);
                
                
            } while (trick.isIsActive());
        
        } while (round.isIsActive());
    
        
        
    }
    
}
