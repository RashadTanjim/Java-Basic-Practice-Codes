package Assignments;

import java.util.Scanner;

class A_1_2 {

    public static void main(String[] args) {
        final int AMOUNT = 10000;
        System.out.print("Enter a amount less than 10000: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        A_1_2 obj = new A_1_2();
        if (n < AMOUNT) {
            System.out.println(n + " = " + obj.convert(n) + " Taka");
        } else {
            System.out.println("Please enter less than 10000");
        }
    }

    public String convert(int number) {

        String[] specialNames = {
            "", " thousand"};

        if (number == 0) {
            return "zero";
        }

        String prefix = "";

        if (number < 0) {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0) {
                String s = amountInwords(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }

    public String amountInwords(int n) {
        String current;

        String[] tensNames = {
            "",
            " ten", " twenty", " thirty", " forty", " fifty",
            " sixty", " seventy", " eighty", " ninety"};

        String[] numNames = {
            "", " one", " two", " three", " four", " five", " six",
            " seven", " eight", " nine", " ten", " eleven", " twelve",
            " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen"};

        if (n % 100 < 20) {
            current = numNames[n % 100];
            n /= 100;
        } else {
            current = numNames[n % 10];
            n /= 10;

            current = tensNames[n % 10] + current;
            n /= 10;
        }

        if (n == 0) {
            return current;
        }
        return numNames[n] + " hundred" + current;

    }

}
