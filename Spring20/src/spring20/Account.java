/**
 * Assignment: 2
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;

import java.util.*;

public class Account {

    static double balance = 0;

    public static double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public static double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double amount;
        int arg;
        while (true) {

            System.out.println("\nPlease Choose any options: \n"
                    + "1. Deposit\n"
                    + "2. Withdraw\n"
                    + "3. CheckBalance\n"
                    + "4. Exit");
            arg = in.nextInt();

            switch (arg) {
                case 1:
                    System.out.println("\nEnter The amount to deposit: ");
                    amount = in.nextDouble();
                    System.out.println("\nThe deposit amount is: " + deposit(amount));
                    break;
                case 2:
                    System.out.println("\nEnter The amount to Withdrow: ");
                    amount = in.nextDouble();
                    System.out.println("\nThe withdrow amount is: " + withdraw(amount));
                    break;
                case 3:
                    System.out.println("\nThe Balance is: " + balance);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nWrong Input!!!");
                    break;
            }
        }

    }

}
