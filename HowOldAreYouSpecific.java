import java.util.Scanner;

public class HowOldAreYouSpecific {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        String userName;
        int userAge;

        System.out.println();

        System.out.println("Hey, what's your name? ");
        userName = keyboard.next();

        System.out.println();

        System.out.println("Ok, " + userName + ", how old are you? ");
        userAge = keyboard.nextInt();

        System.out.println();

        if (userAge <= 15) {
            System.out.println("You can't drive, " + userName);
            System.out.println();
        }

        else if (userAge < 18) {
            System.out.println("You can drive but not vote, " + userName);
            System.out.println();
        }

        else if (userAge < 24) {
            System.out.println("You can vote but not rent a car, " + userName);
            System.out.println();
        }

        else {
            System.out.println("You can do pretty much anything, " + userName);
            System.out.println();
        }
    }
}
