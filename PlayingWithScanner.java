import java.util.Scanner;

public class PlayingWithScanner {
    public static void main(String[] args){

        // Austin Schweickert - 9/16/19
        
        Scanner keyboard = new Scanner(System.in);

        String question1;
        String question2;
        String question3;
        String question4;
        // Remeber to add other variables pls.
        String takeQuiz;
        // String question1, question2, question3, question4;
        String quizQuestion1, quizQuestion2, quizQuestion3, quizQuestion4, quizQuestion5, quizQuestion6, quizQuestion7, quizQuestion8, quizQuestion9, quizQuestion10, quizQuestion11, quizQuestion12, quizQuestion13, quizQuestion14, quizQuestion15, quizQuestion16, quizQuestion17, quizQuestion18, quizQuestion19, quizQuestion20;

        // Below are testing questions

        System.out.println("Is this code a test for using variables on the scanner? ");
        question1 = keyboard.nextLine();

        System.out.println("How do you know? ");
        question2 = keyboard.nextLine();

        System.out.println("Who made this script? ");
        question3 = keyboard.nextLine();

        System.out.println("Why are you even running this script? ");
        question4 = keyboard.nextLine();

        System.out.println("Your answers are as follows: Q1 = " + question1 + " | Q2 = " + question2 + " | Q3 = " + question3 + " | Q4 = " + question4 + " | ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        // Quiz part below.

        System.out.println("Would you like to take a quiz? Just type yes or no.");
        takeQuiz = keyboard.nextLine();

        System.out.println("I don't care what you answered, you get to take it anyways because this is school anyways.");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("Question 1: Is this a good script? ");
        quizQuestion1 = keyboard.nextLine();
        String quizAnswer1 = ("Yes");
        System.out.println("---------------------------------");


        System.out.println("Question 2: Is this the best and most useful script ever? ");
        quizQuestion2 = keyboard.nextLine();
        String quizAnswer2 = ("Much yes");
        System.out.println("---------------------------------");


        System.out.println("Question 3: Do video games cause violence? ");
        quizQuestion3 = keyboard.nextLine();
        String quizAnswer3 = ("Yes, all violence from the human race can be tracked back to video games.");
        System.out.println("---------------------------------");


        System.out.println("Question 4: Who is the president of the USA? ");
        quizQuestion4 = keyboard.nextLine();
        String quizAnswer4 = ("Caillu");
        System.out.println("---------------------------------");


        System.out.println("Question 5: What is the best brand of tea?");
        quizQuestion5 = keyboard.nextLine();
        String quizAnswer5 = ("Arizona Tea");
        System.out.println("---------------------------------");

        
        System.out.println("Question 6: What is the most popular video game of all time?");
        quizQuestion6 = keyboard.nextLine(); 
        String quizAnswer6 = ("Boredom Simulator 2015");
        System.out.println("---------------------------------");


        System.out.println("Question 7: Who was the first man in space?");
        quizQuestion7 = keyboard.nextLine();
        String quizAnswer7 = ("Arnold Schwarzenegger");
        System.out.println("---------------------------------");


        System.out.println("Question 8: What was the first cat in space?");
        quizQuestion8 = keyboard.nextLine();
        String quizAnswer8 = ("Garfield");
        System.out.println("---------------------------------");


        System.out.println("Question 9: Did the big bang actually happen?");
        quizQuestion9 = keyboard.nextLine();
        String quizAnswer9 = ("No, in reality it was just a angry cat who didn't get treats, so he made his own universe.");
        System.out.println("---------------------------------");


        System.out.println("Question 10: What was the most popular movie of all time?");
        quizQuestion10 = keyboard.nextLine();
        String quizAnswer10 = ("Minecraft Hunger Games");
        System.out.println("---------------------------------");


        System.out.println("Question 11: Who killed Dr.Phil?");
        quizQuestion11 = keyboard.nextLine();
        String quizAnswer11 = ("His secret twin brother.");
        System.out.println("---------------------------------");


        System.out.println("Question 12: When did the show Tom & Jerry take over Africa?");
        quizQuestion12 = keyboard.nextLine();
        String quizAnswer12 = ("December 1st, 1498");
        System.out.println("---------------------------------");


        System.out.println("Question 13: What company is Google ran by?");
        quizQuestion13 = keyboard.nextLine();
        String quizAnswer13 = ("Yahoo");
        System.out.println("---------------------------------");


        System.out.println("Question 14: How many questions are left on this quiz?");
        quizQuestion14 = keyboard.nextLine();
        String quizAnswer14 = ("23");
        System.out.println("---------------------------------");


        System.out.println("Question 15: Who invented the first time machine?");
        quizQuestion15 = keyboard.nextLine();
        String quizAnswer15 = ("Robert Zemeckis");
        System.out.println("---------------------------------");


        System.out.println("Question 16: Who killed the first alien?");
        quizQuestion16 = keyboard.nextLine();
        String quizAnswer16 = ("[CLASSIFIED INFORMATION]");
        System.out.println("---------------------------------");


        System.out.println("Question 17: What company produces the best mobile phones?");
        quizQuestion17 = keyboard.nextLine();
        String quizAnswer17 = ("Bing, the web browser.");
        System.out.println("---------------------------------");


        System.out.println("Question 18: What is the most effective way to stop a zombie apocalypse?");
        quizQuestion18 = keyboard.nextLine();
        String quizAnswer18 = ("Kill all living things remaining on the planet so the zombies will die of hunger.");
        System.out.println("---------------------------------");


        System.out.println("Question 19: Who won WWII?");
        quizQuestion19 = keyboard.nextLine();
        String quizAnswer19 = ("Willy Wonka");
        System.out.println("---------------------------------");


        System.out.println("Question 20: Healthiest food ever made?");
        quizQuestion20 = keyboard.nextLine();
        String quizAnswer20 = ("Donuts");
        System.out.println("---------------------------------");

        // Continue?

        String continue1;
        System.out.println("Would you like to continue to see your results?");
        continue1 = keyboard.nextLine();

        // From here down is the chart to compare answers.

        System.out.println("Thanks for taking the quiz! (Even though you did not have a choice...)");
        System.out.println("It really means a lot you took this because this script took 8 years to make!");

        // Chart

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Question 1 | Real answer = " + quizAnswer1 + " | Your answer = " + quizQuestion1 + " | ");
        System.out.println("Question 2 | Real answer = " + quizAnswer2 + " | Your answer = " + quizQuestion2 + " | ");
        System.out.println("Question 3 | Real answer = " + quizAnswer3 + " | Your answer = " + quizQuestion3 + " | ");
        System.out.println("Question 4 | Real answer = " + quizAnswer4 + " | Your answer = " + quizQuestion4 + " | ");
        System.out.println("Question 5 | Real answer = " + quizAnswer5 + " | Your answer = " + quizQuestion5 + " | ");
        System.out.println("Question 6 | Real answer = " + quizAnswer6 + " | Your answer = " + quizQuestion6 + " | ");
        System.out.println("Question 7 | Real answer = " + quizAnswer7 + " | Your answer = " + quizQuestion7 + " | ");
        System.out.println("Question 8 | Real answer = " + quizAnswer8 + " | Your answer = " + quizQuestion8 + " | ");
        System.out.println("Question 9 | Real answer = " + quizAnswer9 + " | Your answer = " + quizQuestion9 + " | ");
        System.out.println("Question 10 | Real answer = " + quizAnswer10 + " | Your answer = " + quizQuestion10 + " | ");
        System.out.println("Question 11 | Real answer = " + quizAnswer11 + " | Your answer = " + quizQuestion11 + " | ");
        System.out.println("Question 12 | Real answer = " + quizAnswer12 + " | Your answer = " + quizQuestion12 + " | ");
        System.out.println("Question 13 | Real answer = " + quizAnswer13 + " | Your answer = " + quizQuestion13 + " | ");
        System.out.println("Question 14 | Real answer = " + quizAnswer14 + " | Your answer = " + quizQuestion14 + " | ");
        System.out.println("Question 15 | Real answer = " + quizAnswer15 + " | Your answer = " + quizQuestion15 + " | ");
        System.out.println("Question 16 | Real answer = " + quizAnswer16 + " | Your answer = " + quizQuestion16 + " | ");
        System.out.println("Question 17 | Real answer = " + quizAnswer17 + " | Your answer = " + quizQuestion17 + " | ");
        System.out.println("Question 18 | Real answer = " + quizAnswer18 + " | Your answer = " + quizQuestion18 + " | ");
        System.out.println("Question 19 | Real answer = " + quizAnswer19 + " | Your answer = " + quizQuestion19 + " | ");
        System.out.println("Question 20 | Real answer = " + quizAnswer20 + " | Your answer = " + quizQuestion20 + " | ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        // Thoughts? 
        String thoughts1;

        System.out.println("Would you like to hear our thoughts on how you did?");
        thoughts1 = keyboard.nextLine();
        System.out.println("Did you really think I would care on what YOU wanted to do? You should of learned from the last time...");
        System.out.println("---------------------------------");

        System.out.println("Since im just code and I don't know how to tell how you did yet, I am willing to bet-");
        System.out.println("that you did quite badly on the quiz due to how advanced and how high level it truly is.");
        System.out.println("I don't know what exactly you were expecting from this java file but eh... You're here now.");
    }
}