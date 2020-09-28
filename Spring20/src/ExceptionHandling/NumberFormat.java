package ExceptionHandling;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- Exception Handling -- Task_1
 */
public class NumberFormat {

    public static void main(String args[]) {
        String value = "100";
        int x = Integer.parseInt(value);
        System.out.println(x * x);

        try {
            String str2 = "hundrad";
            int y = Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            System.out.println("Unable to format. " + e);
        }
    }

}
