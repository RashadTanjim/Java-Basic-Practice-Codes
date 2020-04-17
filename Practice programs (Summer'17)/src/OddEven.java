
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
public class OddEven {

    public static void main(String[] args) {
        int x;
        System.out.print("Enter an integer : ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " an even number.");
        } else {
            System.out.println(x + " an odd number.");
        }
    }
}
