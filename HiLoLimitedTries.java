import java.util.Scanner;
import java.util.Random;

public class HiLoLimitedTries {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();
        int x = 1 + rndm.nextInt(99);

        int userGuess1, userAttempts;

        userAttempts = 1;

        System.out.println("Im thinking of a number between 1-100, try and guess what it is. You have 7 attempts available.");

        System.out.print("First guess: ");
        userGuess1 = keyboard.nextInt();
        System.out.println("");

        if (userGuess1 < x) {
            System.out.println("")
        }
        if (userGuess1 > x) {
            
        }

        while (userGuess1 != x || userAttempts ) {
            userAttempts++;

        }
    }
}