package ca.sheridancollege.project;

import ca.sheridancollege.project.model.Board;
import ca.sheridancollege.project.model.Deck;
import ca.sheridancollege.project.model.Player;
import ca.sheridancollege.project.model.GamePlayers;
import ca.sheridancollege.project.model.Hand;
import ca.sheridancollege.project.model.Round;
import ca.sheridancollege.project.model.Trick;
import ca.sheridancollege.project.model.Turn;
import ca.sheridancollege.project.view.GameView;
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
        Scanner in = new Scanner(System.in);
        GamePlayers gamePlayers = new GamePlayers();
        Deck deck = new Deck();
        Board board = new Board();
        Round round = new Round();
        int playerTurn = 99;
        
        GameView.welcomeGame();
        
        /*Getting the Player names and adding to the gamePlayers obj*/

        while (gamePlayers.size() < 4) {

            try {
                GameView.displayPromptPlayerName(playerNumber);
                in = new Scanner(System.in);
                playerName = in.nextLine();
                Player p = new Player(playerName);
                gamePlayers.setGamePlayer(p);
                playerNumber++;
            } catch (IllegalArgumentException ex) {
                GameView.displayErrorMessage(ex.getMessage());
            }
        }
        
        for (Player p: gamePlayers) {
            Hand hand = new Hand(deck);
            p.setHand(hand);
        }
            
        do {
            Trick trick = new Trick();
            GamePlayers trickPlayers = new GamePlayers();
            
            // ShalowCopy of the array gamePlayers
            for (Player p: gamePlayers)
                trickPlayers.add(p);
            
            //Tests if it is the first turn
            if (playerTurn == 99)
                playerTurn = 0;
            
          
            do {
                if (trickPlayers.size() != 1) {
                    Turn turn = new Turn(trickPlayers.get(playerTurn));
                    String playerEntry = "";
                    ArrayList<Integer> playerMove = new ArrayList();
                    /*Getting the Player movement*/
                    do {
                        try {

                            GameView.displayBoard(board);
                            GameView.displayTurn(turn);
                            

                            in = new Scanner(System.in);
                            playerEntry = in.nextLine();
                            if (playerEntry.equals("p")){
                                if (turn.passTurn(board)) {
                                    GameView.displayFirstTurnPass();
                                } else {
                                    turn.setIsActive(false);
                                    trickPlayers.remove(playerTurn);
                                    if (playerTurn == trickPlayers.size())
                                        playerTurn = 0;
                                }

                                for (Player p: trickPlayers)
                                    System.out.println(p);

                            } else {

                                playerMove = userEntryToArray(playerEntry);

                                turn.playTurn(playerMove, board);

                                if (turn.getPlayer().getHand().size() == 0) {
                                    trick.setIsActive(false);
                                    round.setIsActive(false);
                                    round.setWinner(turn.getPlayer());
                                }

                                playerTurn++;

                                if (playerTurn == trickPlayers.size()) {
                                    playerTurn = 0;
                                } 

                                turn.setIsActive(false);

                            }
                        } catch (Exception e) {
                            GameView.displayErrorMessage(
                                    e.getMessage());
                        }
                    } while (turn.isIsActive());

                } else {
                    trick.setIsActive(false);
                    playerTurn = gamePlayers.indexOf(trickPlayers.get(0));
                    board.clear();
                    // salve the Trick winner
                }
            } while (trick.isIsActive());

        } while (round.isIsActive());
    
         GameView.displayWinner(round.declareWinner());
     
        
    }
    
    public static ArrayList<Integer> userEntryToArray(String playerEntry) {
        ArrayList<Integer> tempArray = new ArrayList();
        String[] playerEntryArray = playerEntry.split("\\s*,\\s*");
        
        for (String s: playerEntryArray)
            tempArray.add(Integer.parseInt(s));
        
        return tempArray;
    }
    
    
}
