package myapp;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Random;

public class GuessNumber {
    public static void main (String[] args){
        // Create a random number generator
        Random rand = new SecureRandom();

        // Generate a number between 1 - 10
        int toGuess = rand.nextInt(10)+1;

        System.out.printf(">>> To guess: %d\n", toGuess);

        // get input from user
        Console cons = System.console();

        int tries =0;

        boolean didWin = false ;

        while (tries <3){
            String input = cons.readLine("Guess a number between 1 - 10. ");
            int myGuess = Integer.parseInt(input);
            
            if (myGuess > toGuess) {
                System.out.println("Too High");
            } else if (myGuess < toGuess) {
                System.out.println("Too Low");
            } else {
                System.out.println("YOU WIN");

                didWin = true;
                break;
            }
        
            tries ++;
        }
            if (!didWin){
            System.out.println("YOU LOSE");
        }

    }
    
}
