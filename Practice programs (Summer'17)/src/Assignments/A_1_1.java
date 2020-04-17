package Assignments;

import java.util.Scanner;

public class A_1_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int n = input.nextInt();

        System.out.println("Hexadecimal number is : 0x" + dex2hex(n));
    }

    public static String dex2hex(int n) {

        String hex = "";
        while (n != 0) {
            int hexValue = n % 16;
            // Convert a decimal value to a hex digit
            char hexDigit = (hexValue <= 9 && hexValue >= 0)
                    ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            hex = hexDigit + hex;
            n = n / 16;
        }
        return hex;
    }
}
