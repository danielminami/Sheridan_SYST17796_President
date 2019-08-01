/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.view;

import java.util.Scanner;

public class GameView {
    
    
    public static void welcomeGame(String enter, Scanner in){
        
         do{
            try{
            System.out.println("Welcome to the game of President! \n");
            Thread.sleep(2000);
            System.out.println("Rules of the game/How to play: \n");
            System.out.println("Objective of the Game: Play all your cards before the other players \n");
            System.out.println("Card Rank Heiarchy (Highest to Lowest): 2 A K Q J 10 9 8 7 6 5 4 3 \n");
            System.out.println("\u2022 52 Cards will be dealt evenly across all 4 players\n");
            System.out.println("\u2022 The player with the 3 of clubs plays first (Must play 3 of clubs)\n");
            System.out.println("\u2022 The game is played in a sequence of tricks");
            System.out.println("   \u2022 The player who starts a trick, can play a single, double, triple or"
                    + " quadruple of the same card.");
                System.out.println("   \u2022 The next player must play the same number of cards, "
                        + "of equal or greater rank, or play a 2.");
                System.out.println("   \u2022 If a player cannot play, or they don’t want to, they may pass.");
                System.out.println("   \u2022 A player who passes is not permitted to play for the duration of the trick\n");
                System.out.println("\u2022 A trick can end 2 ways:");
                System.out.println("   \u2022  All other players pass, the last player to play starts the next trick.");
                System.out.println("   \u2022 Playing a 2, that player starts the next trick\n");
                System.out.println("*The game ends once a player has played all of their cards* \n");
            
            System.out.println("Press Enter to Continue...");
            enter = in.nextLine();
            
            }catch(Exception e){
                throw new IllegalArgumentException();
            }
        }while(enter==null);
    }
}
