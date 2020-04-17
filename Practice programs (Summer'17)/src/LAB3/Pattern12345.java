/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;


 
public class Pattern12345 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int k = 1;

            for (int j = i; j <= 5; j++) {
                System.out.print(k + " ");
                k++;
            }

            System.out.print("\n");
        }
    }
}
