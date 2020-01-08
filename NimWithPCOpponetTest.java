import java.util.Random;
import java.util.Scanner;

public class NimWithPCOpponet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();

        String userGameType1;
        int x;
        // double

        x = rndm.

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
    }

    public static void pcOpponet() {
        barrier();
        System.out.println("It appears you have chosen to play against a PC Opponet! This will be the easier of the two most likely as the opponet does not use any methods or plans. Good Luck!");
    }

    public static void playerOpponet() {
        System.out.println("It appears you have chosen to play against another person! This is probably the harder of the two unless your opponet has no idea how to play.");
        barrier();
        blank();

    }

    public static void blank() {
        System.out.println("");
    }
    
    public static void barrier() {
        System.out.println("- - - -");
    }
}
