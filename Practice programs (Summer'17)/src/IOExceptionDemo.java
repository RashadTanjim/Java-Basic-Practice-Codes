
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionDemo {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        int j = input.nextInt();

        int n;
        int p;
        int length = j - i + 1;
        int[] arra = new int[length];
        int sum = 0;
        int max = 0;

        for (n = i; n <= j; n++) {
            arra[n - i] = n;

        }

        for (p = 0; p < arra.length; p++) {
            sum = 1;
            while (arra[p] != 1) {
                if (arra[p] % 2 != 0) {

                    arra[p] = 3 * arra[p] + 1;
                    sum++;

                } else {

                    arra[p] = arra[p] / 2;
                    sum++;

                }

            }

            max = (max > sum) ? max : sum;
        }
        System.out.println(i + " " + j + " " + max);

    }
}
