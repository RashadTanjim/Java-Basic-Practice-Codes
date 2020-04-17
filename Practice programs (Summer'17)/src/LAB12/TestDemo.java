package LAB12;

import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Price: ");
        BestForCustomer C1 = new BestForCustomer(5, 550, 50);

        System.out.println("Discounted Price: " + C1.discountedPrice(input.nextDouble()) + " Tk.");
    }
}
