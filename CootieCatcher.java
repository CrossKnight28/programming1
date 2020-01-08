import java.util.Scanner;

public class CootieCatcher {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        String choiceCategory;
        int pickNumber;

        choiceCategory = "";
        pickNumber = 0;

        System.out.println("Choose between a 'snowflake', 'polarbear', 'penguin', or 'snowman'");
        choiceCategory = keyboard.next();

        // SNOWFLAKE

        if (choiceCategory.equals("snowflake")) {
            System.out.println("Pick a number 1 or 8");
            pickNumber = keyboard.nextInt();

            if (pickNumber == 1) {
                System.out.println("Where do snowmen keep their money?");
                System.out.println("In a snowbank!");
            }
            else if (pickNumber == 8) {
                System.out.println("What do you get when you mix a snowman and a bear?");
                System.out.println("A \"BRR\"-\"GRR\"!");
            }
        }

        // POLARBEAR

        else if (choiceCategory.equals("polarbear")) {
            System.out.println("Pick a number 2 or 3");
            pickNumber = keyboard.nextInt();

            if (pickNumber == 2) {
                System.out.println("What do you call a snowman on rollerblades?");
                System.out.println("A snowmobile");
            }
            else if (pickNumber == 3) {
                System.out.println("What do the snowmen say to each other?");
                System.out.println("Have an ice-day!");
            }
        }

        // PENGUIN

        else if (choiceCategory.equals("penguin")) {
            System.out.println("Pick a number 4 or 5");
            pickNumber = keyboard.nextInt();

            if (pickNumber == 4) {
                System.out.println("How was the snow globe feeling?");
                System.out.println("A little shaken!");
            }
            else if (pickNumber == 5) {
                System.out.println("What do you call a happy penguin?");
                System.out.println("A pen-grin!");
            }
        }

        // SNOWMAN

        else if (choiceCategory.equals("snowman")) {
            System.out.println("Pick a number 6 or 7");
            pickNumber = keyboard.nextInt();

            if (pickNumber == 6) {
                System.out.println("What's a snowman's favorite dessert?");
                System.out.println("Ice krispy teats!");
            }
            else if (pickNumber == 7) {
                System.out.println("How does a penguin build a house?");
                System.out.println("Igloos it together!");
            }
        }
    }
}