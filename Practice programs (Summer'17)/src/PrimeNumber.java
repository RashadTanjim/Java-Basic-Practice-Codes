
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arnob
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int x, i, flag = 0;

        System.out.print("Enter an Integer : ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        for (i = 2; i < x; i++) {

            if (x % i == 0) {
                flag = 0;
                break;
            } else {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }

}
/*
public void PrimeNumber(int n) {

	        boolean isPrime = true;
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime) {
	            System.out.println(n + " is a prime number");
	        } else {
	            System.out.println(n + " is not a prime number");
	        }
	    }
 */
/* Java Program Example - Check Prime or Not 
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int num, i, count=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
*/
