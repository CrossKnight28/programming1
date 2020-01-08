import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGameCounter {
    public static void main(String[] args) {
        int randomNumber, userNumber;
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int guesses = 1;

        randomNumber = 1 + r.nextInt(9);
        
        System.out.println("I am thinking of a number from 1 to 10! Take a guess!");
        userNumber = keyboard.nextInt();

        while (userNumber != randomNumber) {
            System.out.println("Incorrect! Guess again!");
            userNumber = keyboard.nextInt(); guesses++;
        }

        if (userNumber == randomNumber) {
            System.out.println("You guessed correctly! I was thinking of " + randomNumber);
            System.out.println("It took you " + guesses + " tries to get it correct.");
        }
    }
}