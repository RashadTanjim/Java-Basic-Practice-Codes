// 7.
package Moon;

import java.io.*;
import java.util.*;
import java.lang.IllegalArgumentException;

public class Q7 {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = in.nextLine();

        try {

            if (name.length() <= 7) {
                System.out.println("Your Name: " + name);
            } else {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {

            System.out.println("Your entered name has morethan 7 characters. (" + e + ")");
            name = in.nextLine();
        }
    }

}
