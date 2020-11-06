/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABC;

import java.io.IOException;

/**
 *
 * @author arnob
 */
public class Sub extends Super {

    void show() throws IOException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Super s = new Sub();
        s.show();
    }
}