
import java.util.Scanner;

public class useBMIClass {

    public static void main(String[] args) {

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name, Age , Weight & Height: ");
        BMI bmi1 = new BMI(input.nextLine(), input.nextInt(), input.nextDouble(), input.nextDouble());
        System.out.println("The BMI for " + bmi1.getName() +"(Age: "+ bmi1.getAge()+")"+ " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());

    }
}
