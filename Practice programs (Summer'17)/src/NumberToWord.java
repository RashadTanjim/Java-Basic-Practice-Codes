
import java.util.Scanner;

class NumberToWord {

    public static String[] specialNames = {
        "", " thousand"};

    public static String[] tensNames = {
        "",
        " ten", " twenty", " thirty", " forty", " fifty",
        " sixty", " seventy", " eighty", " ninety"};

    public static String[] numNames = {
        "", " one", " two", " three", " four", " five", " six",
        " seven", " eight", " nine", " ten", " eleven", " twelve",
        " thirteen", " fourteen", " fifteen", " sixteen",
        " seventeen", " eighteen", " nineteen"};

    public String amountInwords(int n) {
        String current;

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

    public String convert(int number) {
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

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        NumberToWord obj = new NumberToWord();
        if (num < 10000) {
            System.out.println(num + " = " + obj.convert(num) + " Taka");
        } else {
            System.out.println("Type less than 10000");
        }
    }

}
