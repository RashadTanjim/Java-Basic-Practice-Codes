//5.a and 5.b
/**
 * Final Assignment
 * Submission Last Date: 04.06.20 
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;
import java.util.*;

public class Happy {

    public static void main(String[] args) {
        if (args.length > 0) {
            printed(args);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The String: ");
        System.out.println(prodInt(in.nextLine()));

    }
//5.a)
    static void printed(String[] hi) {
        for (int i = 0; i <= hi.length; i++) {
            System.out.print(hi[i] + " ");
        }
    }

    //5.b)
    public static int prodInt(String arg) {
        int product = 1;
        StringTokenizer st = new StringTokenizer(arg, "$");
        while (st.hasMoreTokens()) {
            product = (Integer.parseInt(st.nextToken())) * product;
        }
        return product;
    }

}
