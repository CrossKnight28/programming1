import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String emptyLine, thickBarrier, userName;
        int userAge, fiveMoreYears, fiveLessYears, userAgeAfterFiveMoreYears, userAgeAfterFiveLessYears;

        fiveMoreYears = 5;
        fiveLessYears = -5;
        thickBarrier = ("------------------------------------");
        emptyLine = ("                ");

        System.out.println(emptyLine);
        System.out.println(thickBarrier);
        System.out.println(emptyLine);

        System.out.print("Hello. What is your name?   ");
        userName = keyboard.next();

        System.out.println(emptyLine);
        System.out.println(thickBarrier);
        System.out.println(emptyLine);

        System.out.print("How old are you?   ");
        userAge = keyboard.nextInt();

        userAgeAfterFiveLessYears = (userAge + fiveLessYears);
        userAgeAfterFiveMoreYears = (userAge + fiveMoreYears);

        System.out.println(emptyLine);
        System.out.println(thickBarrier);
        System.out.println(emptyLine);

        System.out.println("Did you know in five years that you will be " + userAgeAfterFiveMoreYears + ", and five years ago you were " + userAgeAfterFiveLessYears + ",");
    }
}