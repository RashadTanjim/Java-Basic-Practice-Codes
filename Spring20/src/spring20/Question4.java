package spring20;
import java.util.*;

/**
 * Question: 4
 * @Name: Md Rashad Tanjim
 * ID: 1620952042
 */
public class Question4 {

    public static void main(String[] args) {

        int max = 2020;
        int min = 1990;
        int n = (int) (min+Math.random()*(max-min+1));
        
        if (n / 400 == 0)
        {
            System.out.println(n +":true");
        }
        else if(n/4 == 0 && n/100 != 0)
        {
            System.out.println(n +":true");
        }
        else
        {
            System.out.println(n +":false");
        }

    }

}
