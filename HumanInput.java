import java.util.Scanner;

class HumanInput {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is the capital city of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    // A letter

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();
    // A letter

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();
    }
}