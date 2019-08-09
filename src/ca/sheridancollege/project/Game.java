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
import ca.sheridancollege.project.view.GameView;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Minami
 */
public class Game {
    
    /*
    TODO:   Create all the Java Docs for all classes and Enums of the project
    Comments: the assigned person can list all the tasks and subdivide
    
    AssignedTo: Muaz (Status: hold, wait until project ends)
    */
    
    /*
    TODO:   Create all the Unit Tests for all classes of the project
            with boundary, good and bad tests.
    Comments: the assigned person can list all the tasks and subdivide
    
    AssignedTo: Muaz (Status: hold, wait until project ends)
    */
    
    public static void main(String[] args){
    
        int playerNumber = 1;
        boolean validName = true;
        String playerName = "";
        Scanner in = new Scanner(System.in);
        GamePlayers gamePlayers = new GamePlayers();
        Deck deck = new Deck();
        Board board = new Board();
        Round round = new Round();
        int playerTurn = 99;
        
        GameView.welcomeGame();
        
        /*Getting the Player names and adding to the gamePlayers obj*/
        /* 
        TODO:   Implement the validation for player names, we don't
                have a other criteria than not allowing same names.
                Implement the player comparison in the Player Class equals
                Method by overring it from parent Object
        
        AssignedTo: Stu DONE
        */
        do {
            try {
                validName = true;
                System.out.println("Enter the name of Player "
                        + playerNumber + ": ");
                in = new Scanner(System.in);
                playerName = in.nextLine();
                Player p = new Player(playerName);
                if (playerName.trim().equals("")) {              
                    validName = false;
                    System.out.println("Error: Cannot have blank" 
                            + " player name.");
                } else {
                
                    if (playerNumber == 1) {
                        gamePlayers.add(p);
                        playerNumber++;
                    } else {
                        for (int i = 0; i < gamePlayers.size(); i++) {
                            if (playerName.trim().equals(gamePlayers.get(i).getName())) {
                                validName = false;
                                System.out.println("Error: Cannot have duplicate"
                                        + " player name.");
                            }

                        }
                        if (validName) {
                            gamePlayers.add(p);
                            playerNumber++;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (playerNumber <= 4);
        
        //This loop creates the Player's Hands
        for (Player p: gamePlayers) {
            Hand hand = new Hand(deck);
            p.setHand(hand);
        }
            
        /*
        TODO: Implement the Welcome Message when the 4 players are set.
                It probably should be implemented in the main method
        
        AssignedTo: Muaz (Status: Done)
        */
        /* print the player's hands, used for DEBUG
        for (Player p: gamePlayers) {
            System.out.println(p + "\n");    
        }
        */
       
        do {
            Trick trick = new Trick();
            GamePlayers trickPlayers = new GamePlayers();
            
            // DeepCopy of the array gamePlayers
            for (Player p: gamePlayers)
                trickPlayers.add(p);
            
            //Tests if it is the first turn
            if (playerTurn == 99)
                playerTurn = 0;
            
            /*
            TODO:   Setup the Trick properly (e.g copying the gamePlayers array
                    into a new Object every new Trick).
                    The class Trick might have to be addapted.
            
            AssignedTo: Stu (DONE)
            */
            
            do {
                if (trickPlayers.size() != 1) {
                    Turn turn = new Turn(trickPlayers.get(playerTurn));
                    String playerEntry = "";
                    ArrayList<Integer> playerMove = new ArrayList();
                    /*Getting the Player movement*/
                    do {
                        try {
                            /*
                            TODO:   Improve the user message explaining how to play
                                    correctly.

                            AssignedTo: Muaz (Status: Done)
                            */

                            GameView.displayBoard(board);
                            GameView.displayTurn(turn);
                            
                            /*
                            TODO:   Implement the toString method in hand that
                                    displays the current player hand

                            AssignedTo: Daniel DONE
                            */        

                            in = new Scanner(System.in);
                            playerEntry = in.nextLine();
                            if (playerEntry.equals("p")){
                                /*
                                TODO:   Implement the method pass() in the Turn 
                                        Class. It should also update the Turn object
                                        and check for the whether the Turn isOver.

                                AssignedTo: Daniel (not initiated)
                                */
                                if (turn.passTurn(board)) {
                                    GameView.displayFirstTurnPass();
                                } else {
                                    turn.setIsActive(false);
                                    trickPlayers.remove(playerTurn);
                                    if (playerTurn == trickPlayers.size())
                                        playerTurn = 0;
                                }
                                //for debugging
                                for (Player p: trickPlayers)
                                    System.out.println(p);

                            } else {
                                /*
                                TODO:   Test the user Entry function for bad,
                                        good and boundary tests

                                AssignedTo: Muaz (not initiated)
                                */

                                //placing the users entry in a int Array

                                playerMove = userEntryToArray(playerEntry);

                                /*
                                TODO:   Implement the playTurn method in the Turn
                                        Class. It users the Hand Class and Board
                                        Class to make sure the movement is valid.
                                        By the end of the execution, updates the
                                        objects hand and board.
                                        It should also update the Turn object

                                AssignedTo: Daniel - DONE
                                */                            
                                turn.playTurn(playerMove, board);
                                /*
                                TODO:   Check winning condition and update the
                                        parent objects to declare the winner.

                                AssignedTo: Daniel
                                */
                                if (turn.getPlayer().getHand().size() == 0) {
                                    trick.setIsActive(false);
                                    round.setIsActive(false);
                                    round.setWinner(turn.getPlayer());
                                }

                                playerTurn++;

                                //Resets Players Trick index when 
                                if (playerTurn == trickPlayers.size()) {
                                    playerTurn = 0;
                                } 

                                turn.setIsActive(false);
                                /*for debugging
                                for (Player p: trickPlayers)
                                    System.out.println("PlayerHands After Play() " +p);
                                */
                         


                            }
                        } catch (Exception e) {
                            //System.out.println("Invalid Movement.");
                            System.out.println(e.getMessage());
                        }
                    } while (turn.isIsActive());
                /* TODO:    check whether the Trick is over, otherwise, update 
                            the Trick for next Turn;
                   
                AssignedTo: Stu
                */
                } else {
                    trick.setIsActive(false);
                    playerTurn = gamePlayers.indexOf(trickPlayers.get(0));
                    board.clear();
                    // salve the Trick winner
                }
            } while (trick.isIsActive());

            /* 
            TODO:   check whether the Round is over, otherwise, update 
                    the Trick for next Turn;
            
            AssignedTo: Stu (not initiated)
            */            
            
        } while (round.isIsActive());
    
        /* 
        TODO:   Finish the game:
                    Display the winner
                    Close objects
        
        AssignedTo: Daniel - DONE
        */
        
        GameView.displayWinner(round.declareWinner());
     
        
    }
    
    public static ArrayList<Integer> userEntryToArray(String playerEntry) {
        ArrayList<Integer> tempArray = new ArrayList();
        String[] playerEntryArray = playerEntry.split("\\s*,\\s*");
        
        for (String s: playerEntryArray)
            tempArray.add(Integer.parseInt(s));
        
        /*
        for (Integer i: tempArray)
            System.out.println("tempArray: " + i);
        */
        return tempArray;
    }
    
    
}
