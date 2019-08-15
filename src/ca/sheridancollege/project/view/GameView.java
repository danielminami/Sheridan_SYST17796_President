package ca.sheridancollege.project.view;

import ca.sheridancollege.project.model.Board;
import ca.sheridancollege.project.model.PresidentCard;
import ca.sheridancollege.project.model.Turn;
import java.util.Scanner;

public class GameView {
    
    public static void welcomeGame(){
        String enter = "";
        Scanner in = new Scanner(System.in);
         do{
            try{
            System.out.println("Welcome to the game of President! \n");
            Thread.sleep(2000);
            System.out.println("Rules of the game/How to play: \n");
            System.out.println("Objective of the Game: Play all your cards "
                    + "before the other players \n");
            System.out.println("Card Rank Heiarchy (Highest to Lowest): 2 A "
                    + "K Q J 10 9 8 7 6 5 4 3 \n");
            System.out.println("\u2022 52 Cards will be dealt evenly across "
                    + "all 4 players\n");
            System.out.println("\u2022 The game is played in a sequence "
                    + "of tricks");
            System.out.println("   \u2022 The player who starts a trick, "
                    + "can play a single, double, triple or"
                    + " quadruple of the same card.");
            System.out.println("   \u2022 The next player must play the "
                    + "same number of cards, "
                    + "of equal or greater rank, or play a 2.");
            System.out.println("   \u2022 If a player cannot play, or "
                    + "they don’t want to, they may pass.");
            System.out.println("   \u2022 A player who passes is not "
                    + "permitted to play for the duration of the trick");
            System.out.println("   \u2022 If all other players pass, the "
                    + "last player to play starts the next trick.\n");
            System.out.println("*The game ends once a player has played "
                    + "all of their cards* \n");
            
            System.out.println("Press Enter to Continue...");
            enter = in.nextLine();
            
            }catch(Exception e){
                throw new IllegalArgumentException();
            }
        }while(enter==null);
    }

    public static void displayBoard(Board board) {
        System.out.print("Board status: ");
        for (PresidentCard c: board)
            System.out.print("\t" + c.shortString());
        System.out.print("\n");
    }
    
    public static void displayTurn(Turn turn) {
        System.out.println("Player " + turn.getPlayer().getName() + ", "
                + "your turn:");
        for (int i=0; i<turn.getPlayer().getHand().size(); i++){
            System.out.println("# " + i + " - " + turn.getPlayer().getHand().
                    get(i).shortString());
        }
        System.out.println("Enter 'p' to pass or type the card(s) index(es), "
                + "separating by comma: ");
    }
    
    public static void displayWinner(String winner) {
        System.out.println("Winner: " + winner);
    }
    
    public static void displayFirstTurnPass() {
        System.out.println("You must play a card in the first game turn.");
    }
    
    public static void displayPromptPlayerName(int pn) {
        System.out.println("Enter the name of Player " + pn + ": ");
    }
    
    public static void displayErrorMessage(String s) {
        System.out.println(s);
    }    
}
