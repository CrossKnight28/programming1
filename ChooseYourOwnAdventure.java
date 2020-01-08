import java.util.Scanner;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userAnswer1A;

        System.out.println("");
        System.out.println("You fall asleep after a long and difficult day at school, but as soon as you drift off it seems you have woken up again but something is off... You are not in your bed anymore, but surrounded by fog in a mysterious forest. What do you do? A. Get up and try to find your home, or B. Sit where you are and find a way to wakeup from this horrible dream.");
        userAnswer1A = keyboard.next();

        if (userAnswer1A.equals("A")) {
            System.out.println("You raise up from your sitting position and begin to walk around the forest");
        }
        if else (userAnswer1A.equals("B")) {
            System.out.println("As you sit patiently for this freaky dream of yours to be over, you begin to get cold. At first its just a slight chill, nothing serious as this is just a dream, but as you sit there time keeps passing with nothing happening besides you getting colder and colder. You finally get too cold to handle it and the dream is taking forever to end. You decide to move but the question is, where to? A: T")
        }
        else {
            System.out.println("Please rerun the code and either choose A or B.");
        }
    }
}