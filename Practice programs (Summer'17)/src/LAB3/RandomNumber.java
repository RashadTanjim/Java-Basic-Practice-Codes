/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

//import java.util.Scanner;

/**
 *
 * @author Arnob
 */
public class RandomNumber {

    public static void main(String[] args) {
        int max = 20, min = 5;
        //Scanner input = new Scanner(System.in);
        //int x = input.nextInt(); 
        int n = (int) (min + Math.random() * (max - min + 1));
        System.out.print("Random integer: " + n + "\n");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + "  ");
        }

    }

}
