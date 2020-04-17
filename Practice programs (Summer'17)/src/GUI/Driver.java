package GUI;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Student[] s = new Student[3];

//initialize array from user input
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < s.length; i++) {
            System.out.println("ID");
            String a = t.next();
            t.nextLine();
            System.out.println("Name");
            String b = t.next();

            Student temp = new Student(a, b);
            s[i] = temp;
        }
        try {
            FileWriter f = new FileWriter("students.txt", true);
            for (int i = 0; i < s.length; i++) {
                if (s[i] != null) {
                    f.write(s[i].getId() + "\n" + s[i].getName() + "\n");
                }
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Student[] d = new Student[10];
        int index = 0;
        try {
            File f = new File("students.txt");
            Scanner y = new Scanner(f);
            while (y.hasNextLine() == true) {
                String a = y.nextLine();
                //int b = Integer.parseInt(a);
                String c = y.nextLine();
                Student temp = new Student(a, c);
                d[index] = temp;
                index++;
            }
            for (int i = 0; i < d.length; i++) {
                if (d[i] != null) {
                    System.out.println(d[i].getId() + "," + d[i].getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
