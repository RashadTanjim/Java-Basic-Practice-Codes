
import java.util.Scanner;

/**
 *
 * @author Arnob
 */
public class Assignment_1_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int decimal = input.nextInt();

        // calling method toHexString()
        String str = Integer.toHexString(decimal);
        System.out.println("Decimal to hexadecimal: 0x"+ str);
    }
    
}
