public class NumbersAndMath 
{
    public static void main(String[] args){
        System.out.println("I will now count my chickens:");
        // Adds then divides the numbers.
        System.out.println("Hens " + ( 25 + 30 / 6) );
        // Subtracts, multiplys, then takes the percentage.
        System.out.println("Roosters " + ( 100 - 25 * 3 % 4 ) );

        System.out.println("Now I will count the eggs:");
        // Adds, adds,subtracts, adds, takes the percent, subtracts, divides, adds.
        System.out.println( 3 + 2 + 1 - 5 + 4 % 3 - 1 / 4 + 6 );
        
        System.out.println("Is true that 3 + 2 < 5 - 7?");
        // Says true or false to if it is less than or not.
        System.out.println( 3 + 2 < 5 - 7 );
        // Adds 3 and 2
        System.out.println("What is 3+2? " + ( 3 + 2 ));
        // Subtracts 5 and 7
        System.out.println("What is 5-7? " + ( 5 - 7 ) );

        System.out.println("Oh, thats why it's false.");

        System.out.println("How about some more.");
        // Says true or false to if it is greater than or not.
        System.out.println("Is it greater?" + ( 5 > -2 ) );
        // Says true or fase to if it is greater than or equal to.
        System.out.println("Is it greater or equal? " + ( 5 >= -2 ) );
        // Says true or fasle to if it is less than or equal to.
        System.out.println("Is it less or equal? " + ( 5 <= -2 ) );
    }
}