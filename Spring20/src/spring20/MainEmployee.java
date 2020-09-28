/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;
import java.util.*;


public class MainEmployee {
    public static void main(String[] args) {
        PartTimeEmployee P1 = new PartTimeEmployee();
        FullTimeEmployee F1 = new FullTimeEmployee();
        
        P1.setRate(10000);
        P1.setHours(10);
        
        System.out.println(P1.toString());
        System.out.println(F1.toString());
        
        
        
    }
    
}
