package ExceptionHandling;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- Exception Handling -- Task_4
 */
public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        String[] arr = {"North", "South", "University"};

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]); // array[4] has no elements
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException occurred. " + e);
        }
    }
}
