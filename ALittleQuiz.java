import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userInputQuizOrNot, systemQuizYes, systemQuizNo, systemAnswer1, systemAnswer2, systemAnswer3, correct, incorrect;
        int userAnswer1, userAnswer2, userAnswer3, total;

        total = 0;
        systemQuizYes = ("Yes");
        correct = ("Correct");
        incorrect = ("Incorrect");
        System.out.println("Are you ready for a quiz?");
        userInputQuizOrNot = keyboard.next();
        if (userInputQuizOrNot.equals(systemQuizYes)) {
            System.out.println("Well I hope you're ready! Here we go!");
            System.out.println("");
            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("    1) Melbourne");
            System.out.println("    2) Anchorage");
            System.out.println("    3) Juneau");
            System.out.println("");
            System.out.print("> ");
            userAnswer1 = keyboard.nextInt();
            System.out.println("");
            System.out.println("");

            if (userAnswer1 == 3) {
                System.out.println("Correct! The answer is Juneau.");
                systemAnswer1 = ("Correct");
            }

            else {
                System.out.println("Incorrect! The answer was Juneau.");
                systemAnswer1 = ("Incorrect");
            }

            System.out.println("");
            System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
            System.out.println("    1) Yes");
            System.out.println("    2) No");
            System.out.println("");
            System.out.print("> ");
            userAnswer2 = keyboard.nextInt();
            System.out.println("");
            System.out.println("");

            if (userAnswer2 == 2) {
                System.out.println("Correct! The word \"cat\" can not be stored in a int variable.");
                systemAnswer2 = ("Correct");
            }

            else {
                System.out.println("Incorrect! The word \"cat\" can not be stored in a int variable.");
                systemAnswer2 = ("Incorrect");
            }

            System.out.println("");
            System.out.println("Q3) What is the result of 9+6/3?");
            System.out.println("    1) 5");
            System.out.println("    2) 11");
            System.out.println("    3) 15/3");
            System.out.println("");
            System.out.print("> ");
            userAnswer3 = keyboard.nextInt();
            System.out.println("");
            System.out.println("");

            if (userAnswer3 == 2) {
                System.out.println("Correct! The answer is 11.");
                systemAnswer3 = ("Correct");
            }

            else {
                System.out.println("Incorrect! The answer was 11.");
                systemAnswer3 = ("Incorrect");
            }

            System.out.println("");
            if (systemAnswer1.equals(correct)) {
                total = total + 1;
            }

            if (systemAnswer2.equals(correct)) {
                total = total + 1;
            }

            if (systemAnswer3.equals(correct)) {
                total = total + 1;
            }
            
            if (total == 0) {
                System.out.println("0/3! You may want to retake this quiz after some practice.");
            }
            else if (total == 1) {
                System.out.println("1/3! One is better than none! practice and come on back!");
            }
            else if (total == 2) {
                System.out.println("2/3! You did pretty well! Try and get that last one next time!");
            }
            else if (total == 3) {
                System.out.println("3/3! Woah! You got all three correct!");
            }
        }

        else {
            System.out.println("Oh... Ok then...");
        }
    }
}