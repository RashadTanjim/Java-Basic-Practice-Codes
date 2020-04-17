/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class GuessingNumbers {

    public static void main(String[] args) {

        // Generate a random number to be guessed 
        int number = (int) (Math.random() * 11);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 10");

        while (true) {
            // Prompt the user to guess the number 
            System.out.print("\nEnter your guess: ");
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
                break;
            } else if (guess > number) {
                System.out.println("Your guess is too high");

            } else {
                System.out.println("Your guess is too low");
            }
        } // End of loop 
    } // end main function
} // end of class




/*public static void main(String[] args) {

        // Generate a random number to be guessed 
        int randnumber = (int) (Math.random() * 11);
        System.out.print("Enter a Number from 1 to 10 : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (; randnumber != n;) {
            if (n > randnumber) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
            n = input.nextInt();
        }
        System.out.println("Congo!");

    }
}
 */
