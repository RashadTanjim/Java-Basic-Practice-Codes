/*
(Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
 */
import java.util.Scanner;

public class MonetaryUnits {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        if (amount == 1) {
            System.out.print("1 dollar ");
        } else if (amount > 1) {
            System.out.print((int) amount + " dollars ");
        }
        if (amount == 0) {
            System.out.println("");
        }
        System.out.println(numberOfQuarters + " Quarters " + numberOfDimes + " Dimes " + numberOfNickels + " Nickels " + numberOfPennies + " Pennies");

    }
}

/*
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars
                + (numberOfDollars == 1 ? " dollar" : " dollars"));
        System.out.println(" " + numberOfQuarters
                + (numberOfQuarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + numberOfDimes
                + (numberOfDimes == 1 ? " dime" : " dimes"));
        System.out.println(" " + numberOfNickels
                + (numberOfNickels == 1 ? " nickel" : " nickels"));
        System.out.println(" " + numberOfPennies
                + (numberOfPennies == 1 ? " pennie" : " pennies"));
 */


 /*
import java.util.Scanner;

public class MonetaryUnits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double number = input.nextDouble();
        System.out.println("Your amount " + number + " consists of ");
        int remainingamount = (int) (number * 100);
        int Quarters = remainingamount / 25;
        int Dimes = remainingamount / 10;
        int Nickels = remainingamount / 5;
        int Pennies = remainingamount;

        if (number == 1) {
            System.out.print("1 dollar ");
        } else if (number > 1) {
            System.out.print((int) number + " dollars ");
        }
        if (number == 0) {
            System.out.println("");
        }
        System.out.println(Quarters + " Quarters " + Dimes + " Dimes " + Nickels + " Nickels " + Pennies + " Pennies");
    }    
}


 */
