//6.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class SubClass1 extends Mywish {

    @Override
    public void wishMethod() {
        System.out.println("This is Subclass 1 overriding wishMethod with no arguments");
    }

    public static void main(String args[]) {
        SubClass4 obj = new SubClass4();
        obj.wishMethod();
    }
}
