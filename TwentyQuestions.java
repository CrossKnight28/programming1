import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String answer1, answer2;

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of a object, and i'll try to guess it.");
        System.out.println("");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        System.out.print("> ");
        answer1 = keyboard.next();
        System.out.println("");
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print("> ");
        answer2 = keyboard.next();
        System.out.println("");

        if (answer1.equals("animal") && answer2.equals("yes")) {
            System.out.println("My guess is you are thinking of a moose.");
        }
        else if (answer1.equals("animal") && answer2.equals("no")) {
            System.out.println("My guess is you are thinking of a squirrel.");
        }
        else if (answer1.equals("vegetable") && answer2.equals("yes")) {
            System.out.println("My guess is you are thinking of a watermelon.");
        }
        else if (answer1.equals("vegetable") && answer2.equals("no")) {
            System.out.println("My guess is you are thinking of a carrot.");
        }
        else if (answer1.equals("mineral") && answer2.equals("yes")) {
            System.out.println("My guess is you are thinking of a paper clip.");
        }
        else if (answer1.equals("vegetable") && answer2.equals("no")) {
            System.out.println("My guess is you are thinking of a Camaro.");
        }

        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }
}