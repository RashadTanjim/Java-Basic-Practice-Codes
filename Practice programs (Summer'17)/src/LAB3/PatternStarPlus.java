/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

public class PatternStarPlus {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < (2 * i - 1); j++) {
                if (i % 2 != 0) {
                    System.out.print("*");

                } else {
                    System.out.print("+");
                }

            }
            

        }

    }

}
