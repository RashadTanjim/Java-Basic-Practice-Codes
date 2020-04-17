
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class BodyMaxIndex {

    public static void main(String[] args) {
        int x;
        System.out.println("Type your weight : ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        if (x <= 15) {
            System.out.println("Below 16");
        } else if (x >= 16 && x <= 18) {
            System.out.println("Under weight");
        } else if (x >= 19 && x <= 24) {
            System.out.println("Normal weight");
        } else if (x >= 25 && x <= 29) {
            System.out.println("Over weight");
        } else if (x >= 30 && x <= 35) {
            System.out.println("Seriously weight");
        } else if (x > 35) {
            System.out.println("Gravely weight");
        } else {
            System.out.println("Wrong Input");
        }

    }

}
