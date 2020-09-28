package ExceptionHandling;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- Exception Handling -- Task_3
 */
public class NullPointer {

    public static void main(String[] args) {
        // Initializing String variable with null value 
        String str = null;

        // Checking if ptr.equals null or works fine. 
        try {
            // This line of code throws NullPointerException 
            // because ptr is null 
            if (str.equals("NSU")) {
                System.out.print("Matched!");
            } else {
                System.out.print("Miss matched!");
            }
        } catch (NullPointerException e) {
            System.out.print("NullPointerException occurred. " + e);
        }
    }
}
