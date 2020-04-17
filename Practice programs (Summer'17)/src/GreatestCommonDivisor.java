
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
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two integers : ");
        Scanner input1 = new Scanner(System.in);
        a = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        b = input2.nextInt();
        while (b % a != 0) {
            int r = b % a;
            b = a;
            a = r;
        }
        System.out.println("The Greatest Common Divisor is : " + a);

    }
}
