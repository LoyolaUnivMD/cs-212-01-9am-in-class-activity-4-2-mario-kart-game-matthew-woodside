// Imports the Scanner utility
import java.util.Scanner;
public class MarioKartGame {

    // Main Method
    public static void main(String[] args){

        // Sets up the Scanner utility with 'input'
        Scanner input = new Scanner(System.in);

        // Asks users for their names, stores values
        System.out.println("What is your name player 1: ");
        String player1 = input.next();
        System.out.println("What is your name player 2: ");
        String player2 = input.next();

        // Outputs the player's characters
        System.out.println("Player 1, you are Mario! Player 2, you are Luigi!");

        // Performs the desired operations: makes instances, displays info, speeds up
        MarioKartPlayer mario = new MarioKartPlayer(player1, "Mario", 50);
        MarioKartPlayer luigi = new MarioKartPlayer(player2, "Luigi", 60);
        mario.displayInfo();
        luigi.displayInfo();
        mario.boost();
        luigi.boost();
        mario.displayInfo();
        luigi.displayInfo();
    }
}
