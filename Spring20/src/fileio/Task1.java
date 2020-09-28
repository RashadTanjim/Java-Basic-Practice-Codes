//1. Write a program that takes integers from user and writes them into a file until user inputs a negative number. 
//   The program should then read the file and print sum and average of the numbers.
package fileio;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- File IO
 */
public class Task1 {

    public static void main(String[] args) {

        double a = 0, sum = 0, count = 0;
        double avg = 0;

        try {
            File f = new File("data.txt");

            Scanner s = new Scanner(System.in);
            System.out.println("Enter Integers : ");
            int input = s.nextInt();

            //takes input and write it to the file
            FileWriter writer = new FileWriter(f);

            while (input >= 0) {
                writer.write(input + "\n");

                input = s.nextInt();
            }
            writer.close();

            //scans the file
            Scanner scan = new Scanner(f);

            while (scan.hasNext()) {
                int convertedInt = Integer.parseInt(scan.next());
                sum += convertedInt;
                count++;
            }

            scan.close();
            
            avg = sum / count;
            System.out.println("Sum is: " + sum);
            System.out.println("Avg is: " + avg);

        } catch (IOException e) {
            System.out.println("An error occured");
        }

    }

}
