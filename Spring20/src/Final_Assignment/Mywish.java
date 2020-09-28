//6.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class Mywish {

    public void wishMethod() {
        System.out.println("This is Main wishMethod with no arguments.\n");
    }

    // 3times overloading
    public void wishMethod(String args) {
        System.out.println("This is String Type wishMethod.");
    }

    public void wishMethod(double args, double args2) {
        System.out.println("This is Double Type wishMethod.");
    }

    public void wishMethod(int args) {
        System.out.println("This is Integer Type wishMethod.");
    }

    public static void main(String args[]) {
        Mywish obj = new Mywish();

        obj.wishMethod();               //wishMethod()
        obj.wishMethod("Engineer");     //overloading-1
        obj.wishMethod(1);              //overloading-2
        obj.wishMethod(10.10, 10.10);   //overloading-3
    }
}
