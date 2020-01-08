import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userGender, userName1, userName2, userMarried;
        int userAge;

        System.out.println("");

        System.out.print("What is your gender? (M or F): ");
        userGender = keyboard.next();
        System.out.println("");

        System.out.print("First Name: ");
        userName1 = keyboard.next();
        System.out.println("");

        System.out.print("Last Name: ");
        userName2 = keyboard.next();
        System.out.println("");

        System.out.print("Age: ");
        userAge = keyboard.nextInt();
        System.out.println("");

        if (userGender.equals("M")) {
            if (userAge >= 20) {
                System.out.println("Then I shall call you Mr. " + userName2 + ".");
            }
            else {
                System.out.println("Then I shall call you " + userName1 + " " + userName2 + ".");
            }
        }
        else if (userGender.equals("F")) {
            if (userAge >= 20) {
                System.out.println("Are you married, " + userName1 + "? (Y or N)");
                userMarried = keyboard.next();

                if (userMarried.equals("Y")) {
                    System.out.println("Then I shall call you Mrs. " + userName2 + ".");
                }
                else if (userMarried.equals("N")) {
                    System.out.println("Then I shall call you Ms. " + userName2 + ".");
                }
            }
            else if (userAge < 20) {
                System.out.println("Then I shall call you " + userName1 + " " + userName2 + ".");
            }
        }
    }
}