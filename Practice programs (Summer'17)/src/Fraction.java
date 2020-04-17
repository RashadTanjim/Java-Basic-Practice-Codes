//Lab-8 Task
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;

    }

    public void add(Fraction f) {
        int a = numerator * f.getDenominator() + denominator * f.getNumerator();
        int b = denominator * f.getDenominator();
        numerator = a;
        denominator = b;
    }

    public void sub(Fraction f) {
        int a = numerator * f.getDenominator() - denominator * f.getNumerator();
        int b = denominator * f.getDenominator();
        numerator = a;
        denominator = b;
    }

    public void multiply(Fraction f) {
        int a = numerator * f.getNumerator();
        int b = denominator * f.getDenominator();
        numerator = a;
        denominator = b;
    }

    public void div(Fraction f) {
        int a = numerator * f.getDenominator();
        int b = denominator * f.getNumerator();
        numerator = a;
        denominator = b;
    }

}
