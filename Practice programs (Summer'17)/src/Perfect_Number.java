
import java.util.Scanner;

public class Perfect_Number {

    public static void main(String[] args) {
        int i, Number, Sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter any Number: ");
        Number = input.nextInt();

        for (i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.printf("%d is a Perfect Number", Number);
        } else {
            System.out.printf("%d is NOT a Perfect Number", Number);
        }
        System.out.println();
    }

}
