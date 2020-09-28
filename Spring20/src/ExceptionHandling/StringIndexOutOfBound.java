package ExceptionHandling;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- Exception Handling -- Task_2
 */
public class StringIndexOutOfBound {

    public static void main(String[] args) {
        String str = "North South University";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("\nLength: " + str.length());
        //Accessing element at greater than the length of the String
        try {
            System.out.println(str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred." + e);
        }
    }
}
