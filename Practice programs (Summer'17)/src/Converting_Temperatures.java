
import java.util.Scanner;


/**
 * Write a program that converts a Fahrenheit degree to Celsius using the formula.
 */
public class Converting_Temperatures {
    public static void main(String[] args) {
        float f,c;
        System.out.print("Enter a Fahrenheit degree : ");
        Scanner in = new Scanner(System.in);
        f = in.nextFloat();
        c = ((f-32)*5)/9;
        System.out.println("The Temp in Celsius is : " +c);
        
    }
}
