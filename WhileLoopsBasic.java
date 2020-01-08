import java.util.Scanner;
import java.util.Random;

public class WhileLoopsBasic {
    public static void main(String[] args) {
        int randomNumber, userNumber;
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        randomNumber = 1 + r.nextInt(9);
        
        System.out.println("I am thinking of a number from 1 to 10! Take a guess!");
        userNumber = keyboard.nextInt();

        while (userNumber != randomNumber) {
            System.out.println("Incorrect! Guess again!");
            userNumber = keyboard.nextInt();
        }

        if (userNumber == randomNumber) {
            System.out.println("You guessed correctly! I was thinking of " + randomNumber);
        }
    }
}