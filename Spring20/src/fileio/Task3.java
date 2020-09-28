package fileio;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- File IO
 */
public class Task3 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Arnob", "123");
        Employee e2 = new Employee("Tanjim", "456");
        Employee e3 = new Employee("Rashad", "789");

        // Serializing 
        try {
            FileOutputStream fileOut
                    = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e1);
            out.writeObject(e2);
            out.writeObject(e3);
            out.close();
            fileOut.close();
            System.out.printf("Serialized info of Employee is saved in 'employee.txt' file");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserializing
        Employee e4 = null;
        Employee e5 = null;
        Employee e6 = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e4 = (Employee) in.readObject();
            e5 = (Employee) in.readObject();
            e6 = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("\nEmployee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("\nDeserialized Employee info...");
        System.out.println(e4.toString());
        System.out.println(e5.toString());
        System.out.println(e6.toString());

    }

}
