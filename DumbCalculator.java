import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double userNumber1, userNumber2, userNumber3, systemAnswer1, systemAnswer2;

        System.out.println("Please input a number.");
        userNumber1 = keyboard.nextDouble();

        System.out.println("Please input a second number.");
        userNumber2 = keyboard.nextDouble();

        System.out.println("Please input 1 more number.");
        userNumber3 = keyboard.nextDouble();

        systemAnswer1 = (userNumber1 + userNumber2 + userNumber3);
        systemAnswer2 = (systemAnswer1 / 2);

        System.out.println("(" +userNumber1 + " + " + userNumber2 + " + " + userNumber3 + ")/2 is...  " + systemAnswer2 + "!");
    }
}