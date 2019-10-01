import java.util.Scanner;

public class SellingYourInformation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstName, lastName, grade, studentID, loginID, userGPA, emptyLine;

        emptyLine = ("            ");

        System.out.println(emptyLine);

        System.out.println("Hello, feel free to give me your information so I can totally not sell it....");
        System.out.println(emptyLine);
        System.out.print("What is your first name?  ");
        firstName = keyboard.next();
        System.out.println(emptyLine);

        System.out.println(emptyLine);
        System.out.print("What is your last name?  ");
        lastName = keyboard.next();
        System.out.println(emptyLine);

        System.out.println(emptyLine);
        System.out.print("What grade are you in?  ");
        grade = keyboard.next();
        System.out.println(emptyLine);

        System.out.println(emptyLine);
        System.out.print("What is your student ID?  ");
        studentID = keyboard.next();
        System.out.println(emptyLine);

        System.out.println(emptyLine);
        System.out.print("What is you login name?  ");
        loginID = keyboard.next();
        System.out.println(emptyLine);

        System.out.println(emptyLine);
        System.out.print("What is your GPA?  ");
        userGPA = keyboard.next();
        System.out.println(emptyLine);

        System.out.println(emptyLine);
        System.out.println("Thank you for giving us your information! We will totally keep this VERY safe!1!!1");
        System.out.println("    " + firstName + "   ");
        System.out.println("    " + lastName + "   ");
        System.out.println("    " + grade + "   ");
        System.out.println("    " + studentID + "   ");
        System.out.println("    " + loginID + "   ");
        System.out.println("    " + userGPA + "   ");

        System.out.println(emptyLine);
    }
}