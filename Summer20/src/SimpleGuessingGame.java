
import java.util.*;

class WrongGuess extends Exception {   //custom exception class

    WrongGuess(String s) {
        super(s);
        System.out.println("Opps! Please, Try again! ");
    }
}

class SimpleGuessingGame {

    static void compareValue(int input) throws WrongGuess {
        Random rand = new Random();  		//random value generation 
        int value = rand.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (value == input) {
                System.out.println("Great!");
            } else {
                throw new WrongGuess("!!!"); //throwing customized exception class to main
            }
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Guess in between 0 to 5:");

        try {
            for (int i = 0; i < 5; i++) {  // looping for input
                compareValue(in.nextInt());
                System.out.println("Guess Again!");
            }
        } catch (WrongGuess m) {  // catching if the user gives wrong guess
            System.out.println("Good Luck next time! " + m);
        } finally {
            System.out.println("Thanks for playing...");
        }
    }
} //end
