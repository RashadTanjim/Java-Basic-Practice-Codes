
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
public class Series {

    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        int evens = 0, odds = 0;
        int n = 0, result;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evens = evens + i;
            } else {
                odds = odds + i;
            }
        }
        result = odds - evens;
        System.out.println("The sum is : " + result);
    }
}
