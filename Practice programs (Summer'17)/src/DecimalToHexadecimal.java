
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arnob
 */
public class DecimalToHexadecimal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int n = sc.nextInt();
        System.out.print("Hexadecimal number is : 0x");
        System.out.print(dex2hex(n));
    }

    public static String dex2hex(int n) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";
        while (n != 0) {
            rem = n % 16;
            hexadecimal = ch[rem] + hexadecimal;
            n = n / 16;
        }
        System.out.println(hexadecimal);
        return null;

    }
}
