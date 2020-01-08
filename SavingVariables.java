public class SavingVariables {
    public static void main(String[] args) {
        int x, y, age, yes2;
        double seconds, e, checking, yes1;
        String firstName, lastName, title, yes3, yes4;

        yes2 = 28;
        yes1 = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;
        yes3 = "Yes3";
        yes4 = "Yes4";

        System.out.println(yes1);
        System.out.println(yes2);
        System.out.println(yes3);
        System.out.println(yes4);

        x = 10;
        y = 400;
        age = 39;
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";

        System.out.println("The variable x contains " + x);
        System.out.println("The value " + y + " is stored in variable y.");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favorite irrational # is Euler's number: " + e);
        System.out.println("Hopefully you have more than $" + checking + "!");
        System.out.println("My name's " + title + " " + firstName + lastName);
    }
}