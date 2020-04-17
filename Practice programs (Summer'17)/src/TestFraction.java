//Lab-8 Task

public class TestFraction {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        System.out.println(f1.toString());//value before add/sub
        f1.add(f2);
        System.out.println(f1.toString());//value after add
        f1.sub(f2);
        System.out.println(f1.toString());//value after sub
        f1.multiply(f2);
        System.out.println(f1.toString());//value after multiply
        f1.div(f2);
        System.out.println(f1.toString());//value after div

    }

}
