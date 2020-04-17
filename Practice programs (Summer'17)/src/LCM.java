
import java.util.Scanner;

class LCM {

    public static void main(String args[]) {

        int a, b, max, min, x, lcm = 1;
        System.out.print("Enter the 1st number : ");
        Scanner input1 = new Scanner(System.in);
        a = input1.nextInt();
        System.out.print("Enter the 2nd number : ");
        Scanner input2 = new Scanner(System.in);
        b = input2.nextInt();

// Finding the maximum and minimum numbers
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        /*
To find the maximum and minimum numbers, you can also use
int max=a>b?a:b;
int min=a<b?a:b;
         */
        for (int i = 1; i <= min; i++) {
            x = max * i; //finding multiples of the maximum number
            if (x % min == 0) //Finding the multiple of maximum number which is divisible by the minimum number.
            {
                lcm = x; //making the 1st multiple of maximum number as lcm, which is divisible by the minimum number
                break; //exiting from the loop, as we don’t need anymore checking after getting the LCM
            }
        }
        System.out.println("L.C.M. = " + lcm);
    }
}
