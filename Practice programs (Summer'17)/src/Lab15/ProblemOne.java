/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peyash
 */
public class ProblemOne {

    public static void main(String[] args) throws IOException {
        File f = new File("data.txt");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Integers : ");
        int input = s.nextInt();

        //takes input and write it to the file
        FileWriter writer = new FileWriter(f);

        while (input >= 0) {
            writer.write(input + "\n");

            input = s.nextInt();
        }

        writer.close();
        //....................................

        ArrayList<Integer> list = new ArrayList<Integer>();

        //scans the file
        Scanner scan = new Scanner(f);

        while (scan.hasNext()) {
            int convertedInt = Integer.parseInt(scan.next());
            list.add(convertedInt);
        }

        scan.close();

        //sum, average, min max calculation
        int sum = 0;
        int max = 0;
        int min = list.get(0);
        double average;

        for (Integer temp : list) {
            sum += temp;
            max = (max < temp) ? temp : max;
            min = (min > temp) ? temp : min;
        }

        average = (double) sum / list.size();

        System.out.println(sum + ", " + average + ", " + max + ", " + min);

    }

}
