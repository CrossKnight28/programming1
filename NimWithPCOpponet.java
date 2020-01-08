import java.util.Random;
import java.util.Scanner;

public class NimWithPCOpponet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();

        String userGameType1, playerName1, playerName2;
        int x, amountLeftA, amountLeftB, amountLeftC;


        // double
        boolean gameEnded;

        x = 1 + rndm.nextInt(10);
        amountLeftA = 3;
        amountLeftB = 4;
        amountLeftC = 5;

        randomNameGenerator();

        blank();
        barrier();
        blank();
        System.out.println("Nim is a strategy game between two players.");
        blank();
        System.out.println("Start by placing counters (coins or toothpicks or something) into 3 piles.");
        System.out.println("Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)");
        System.out.println("Player #2 picks a pile, then removes one or more counters from that pile.");
        System.out.println("Player #1 plays again. (It's okay to choose a different pile this time.)");
        System.out.println("Whichever player is forced to take the last counter is the LOSER.");
        blank();
        barrier();
        blank();
        System.out.println("Now that you have the basic knowledge of how NIM works, do you want to play against a PC or another person? A: PC, B: Another Player");
        blank();
        System.out.print("> ");
        userGameType1 = keyboard.next();
        blank();

        if (userGameType1.equals("A")) {
            pcOpponet();
        }
        else if (userGameType1.equals("B")) {
            playerOpponet();
        }
        else {
            System.out.println("Please only choose A or B");
        }
    }









    // PC OPPONET

    public static void pcOpponet() {
        gameEnded = (amountLeftA == 0 && amountLeftB == 0 && amountLeftC == 0);
        
        barrier();
        blank();
        System.out.println("It appears you have chosen to play against a PC Opponet! This will be the easier of the two most likely as the opponet does not use any methods or plans. Good Luck!");
        System.out.println("Player, enter your name: ");
        System.out.print("> ");

        blank();
        barrier();
        while (gameEnded) {
            System.out.println("A: " + amountLeftA + "  B: " + amountLeftB + "  C: " +amountLeftC + " ");
            blank();
            System.out.println("It's " + name + "'s turn!'");
            
        }
    }








    // PLAYER OPPONET

    public static void playerOpponet() {
    }








    // STRUCTURE

    public static void blank() {
        System.out.println("");
    }
    
    public static void barrier() {
        System.out.println("- - - -");
    }










    // NAME GENERATOR

    public static void randomNameGenerator() {
        String name;
        int nameGenRndm;

        Random rndm = new Random();

        nameGenRndm = 1 + rndm.nextInt(19);

        name = "";

        if (nameGenRndm == 1) {
            name = "Liam";
        }
        else if (nameGenRndm == 2) {
            name = "Noah";
        }
        else if (nameGenRndm == 3) {
            name = "William";
        }
        else if (nameGenRndm == 4) {
            name = "James";
        }
        else if (nameGenRndm == 5) {
            name = "Oliver";
        }
        else if (nameGenRndm == 6) {
            name = "Benjamin";
        }
        else if (nameGenRndm == 7) {
            name = "Elijah";
        }
        else if (nameGenRndm == 8) {
            name = "Lucas";
        }
        else if (nameGenRndm == 9) {
            name = "Mason";
        }
        else if (nameGenRndm == 10) {
            name = "Logan";
        }
        else if (nameGenRndm == 11) {
            name = "Emma";
        }
        else if (nameGenRndm == 12) {
            name = "Olivia";
        }
        else if (nameGenRndm == 13) {
            name = "Ava";
        }
        else if (nameGenRndm == 14) {
            name = "Isabella";
        }
        else if (nameGenRndm == 15) {
            name = "Sophia";
        }
        else if (nameGenRndm == 16) {
            name = "Charlotte";
        }
        else if (nameGenRndm == 17) {
            name = "Mia";
        }
        else if (nameGenRndm == 18) {
            name = "Amelia";
        }
        else if (nameGenRndm == 19) {
            name = "Harper";
        }
        else if (nameGenRndm == 20) {
            name = "Evelyn";
        }
        else {
            name = "NAME GENERATOR ERROR - RANDOM VALUE OFF";
        }







    }
}