import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int userHeightFeet, userHeightInches, userWeightPounds;
        double totalInchesHigh, totalWeightKG, totalMetersHigh, totalBMI;

        System.out.println("     ");
        System.out.println("This program will calculate your BMI. Please do not use decimals.");
        System.out.println("Please put your height here. (Feet)");
        System.out.println("     ");
        userHeightFeet = keyboard.nextInt();

        System.out.println("Please put your height here. (Inches)");
        System.out.println("     ");
        userHeightInches = keyboard.nextInt();
        System.out.println("     ");

        System.out.println("Please put your weight here in pounds.");
        System.out.println("     ");
        userWeightPounds = keyboard.nextInt();
        System.out.println("     ");

        totalInchesHigh = (userHeightFeet * 12 + userHeightInches);
        totalWeightKG = (userWeightPounds / 2.205);
        totalMetersHigh = (totalInchesHigh / 39.37);
        totalBMI = (totalWeightKG / (totalMetersHigh * totalMetersHigh));
        System.out.println("     ");
        System.out.println("Your total BMI is: " + totalBMI);
        System.out.println("     ");
;    }
}