import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        String userName;
        int userAge;

        System.out.println("Hey, what's your name? ");
        userName = keyboard.next();

        System.out.println("Ok, " + userName + ", how old are you? ");
        userAge = keyboard.nextInt();

        if (userAge >= 25) {
            System.out.println("You can do anything thats legal.");
        }

        if (userAge < 16) {
            System.out.println("You can't drive, " + userName + ".");
        }

        if (userAge < 18) {
            System.out.println("You can't vote, " + userName + ".");
        }

        if (userAge < 25) {
            System.out.println("You can't rent a car, " + userName + ".");
        }
    }
}

