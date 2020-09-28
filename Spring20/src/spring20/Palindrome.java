/**
 * Assignment: 2
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Please Enter The String: ");
        Scanner in = new Scanner(System.in);
        String arg = in.next();
        if (isPalindrome(arg)) {
            System.out.println("The String is Palindrome! ");
        } else {
            System.out.println("The String is not Palindrome! ");
        }

    }

    public static boolean isPalindrome(String arg) {
        String reverse = "";
        for (int i = arg.length() - 1; i >= 0; i--) {
            reverse = reverse + arg.charAt(i);
        }
        return arg.equals(reverse);
    }
}
