package Lab6;

/**
 * Md Rashad Tanjim
 * ID: 1620952042
 * LAB-6 Task
 */
public class TestFraction {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        System.out.println("Value before Calculation: "+ f1.toString());//value before add/sub
        f1.add(f2);
        System.out.println("Value After Add: " + f1.toString());//value after add
        f1.sub(f2);
        System.out.println("Value After Sub: " + f1.toString());//value after sub
        f1.multiplication(f2);
        System.out.println("Value After Multiplication: " + f1.toString());//value after multiplication
        f1.division(f2);
        System.out.println("Value After Division: " + f1.toString());//value after division

    }

}
