import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String nameInput;
        int ageInput;
        double salaryInput;

        System.out.println("Hello. What is your name?");
        nameInput = keyboard.next();
        

        System.out.println("Hi, " + nameInput + "! How old are you?");
        ageInput = keyboard.nextInt();


        System.out.println("So your'e " + ageInput+ ", eh? That's not old at all!");
        System.out.println("How much do you make, Dennis?");
        salaryInput = keyboard.nextDouble();


        System.out.println("" + salaryInput + "! I hope that's per hour and not per year! LOL!");
    }
}