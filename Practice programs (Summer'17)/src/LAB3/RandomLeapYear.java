/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

public class RandomLeapYear {

    public static void main(String[] args) {
        int max = 2020, min = 1990;

        int i = (int) (min + Math.random() * (max - min + 1));
        System.out.print("Random integer: " + i + "\n");

        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
            System.out.println(i+ ": true");
            
        } else {
            System.out.println(i+ ": false");
            
        }

    }

}
