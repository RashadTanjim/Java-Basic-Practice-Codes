/**
 * Assignment: 2
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;

import java.util.*;

public class CountVowel {

    public static void main(String[] args) {

        System.out.println("Please Enter The String: ");
        Scanner in = new Scanner(System.in);
        String Vowel = in.next();
        System.out.println("The Number of Vowels are: " + countVowel(Vowel));

    }

    public static int countVowel(String arg) {
        int count = 0;

        arg = arg.toLowerCase();
        for (int i = 0; i < arg.length(); ++i) {
            char ch = arg.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++count;
            }
        }
        return count;
    }
}
