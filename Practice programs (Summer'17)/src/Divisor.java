/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Divisor {

    public static void main(String args[]) {
        System.out.print("Enter the number :  ");

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        System.out.print("Divisors of " + n + " = ");
        
        // Loop from 1 to 'n'
        for (int i = 1; i < n; i++) {
            
            // If remainder is 0 when 'n' is divided by 'i'
            if (n % i == 0) {
                System.out.print(i + " , ");
            }

        }
        System.out.println(n);

    }
}
