package Lab6;
import java.util.*;
/**
 * Md Rashad Tanjim
 * ID: 1620952042
 * LAB-6 Task
 */
public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    void add (Fraction fraction)
    {
        int a = numerator * fraction.getDenominator() + denominator * fraction.getNumerator();
        int b = denominator * fraction.getDenominator();
        numerator = a;
        denominator = b;
    }
     void sub (Fraction fraction)
    {
        int a = numerator * fraction.getDenominator() - denominator * fraction.getNumerator();
        int b = denominator * fraction.getDenominator();
        numerator = a;
        denominator = b;
    }
     void multiplication (Fraction fraction)
    {
        int a = numerator * fraction.getNumerator();
        int b = denominator * fraction.getDenominator();
        numerator = a;
        denominator = b;
    }
     
     void division (Fraction fraction)
    {
        int a = numerator * fraction.getDenominator();
        int b = denominator * fraction.getNumerator();
        numerator = a;
        denominator = b;
    }
}
