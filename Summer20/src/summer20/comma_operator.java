/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer20;

/**
 *
 * @author arnob
 */
public class comma_operator {

    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}
