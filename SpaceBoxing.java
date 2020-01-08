import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int userInputWeight, userInputPlanetChoice;
        double systemWeightOnPlanetChoice;

        System.out.println();
        System.out.print("Please enter your current weight: ");
        userInputWeight = keyboard.nextInt();
        System.out.println();

        System.out.println("Please select a planet, and type the number of the planet below.");
        System.out.println("   1. Venus    2. Mars    3. Jupiter");
        System.out.println("   4. Saturn   5. Uranus  6. Neptune");
        userInputPlanetChoice = keyboard.nextInt();
        System.out.println();

        if (userInputPlanetChoice == 1) {
            systemWeightOnPlanetChoice = (userInputWeight * 0.78);
            System.out.println("Your weight on Venus would be: " + systemWeightOnPlanetChoice);
        }

        else if (userInputPlanetChoice == 2) {
            systemWeightOnPlanetChoice = (userInputWeight * 0.39);
            System.out.println("Your weight on Mars would be: " + systemWeightOnPlanetChoice);
        }

        else if (userInputPlanetChoice == 3) {
            systemWeightOnPlanetChoice = (userInputWeight * 2.65);
            System.out.println("Your weight on Jupiter would be: " + systemWeightOnPlanetChoice);
        }

        else if (userInputPlanetChoice == 4) {
            systemWeightOnPlanetChoice = (userInputWeight * 1.17);
            System.out.println("Your weight on Saturn would be: " + systemWeightOnPlanetChoice);
        }

        else if (userInputPlanetChoice == 5) {
            systemWeightOnPlanetChoice = (userInputWeight * 1.05);
            System.out.println("Your weight on Uranus would be: " + systemWeightOnPlanetChoice);
        }

        else if (userInputPlanetChoice == 6) {
            systemWeightOnPlanetChoice = (userInputWeight * 1.23);
            System.out.println("Your weight on Neptune would be: " + systemWeightOnPlanetChoice);
        }
    }
}