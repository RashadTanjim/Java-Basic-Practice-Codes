// Section 2 -- Q1
package Moon;

import java.io.*;
import java.util.*;

public class Input_Mismatch_Exception {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the age: ");
        int x;

        try {
            x = in.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Wrong Input! Please input an Integer. (" + e + ")");
        }
    }

}
