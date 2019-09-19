import java.util.Scanner;

public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String stringInput1, stringInput2;

        int intInput1, intInput2;

        System.out.println("Give me a number!");
        intInput1 = keyboard.nextInt();

        System.out.println("Give me a second number!");
        intInput2 = keyboard.nextInt();

        System.out.println("Now give me a word!");
        stringInput1 = keyboard.next();

        System.out.println("Just one more word please!");
        stringInput2 = keyboard.next();
    }
}