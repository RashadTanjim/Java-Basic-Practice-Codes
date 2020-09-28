package fileio;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- File IO
 */
public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File f = new File("records.txt");

            //this ArrayList stores quizz objects
            ArrayList<Quiz> record = new ArrayList<Quiz>();

            Scanner scan = new Scanner(f);

            while (scan.hasNext()) {
                String id = scan.next();
                float mark = Float.parseFloat(scan.next());

                record.add(new Quiz(id, mark));
            }
            scan.close();

            float highest = 0;
            int index = 0;

            //determines index of the Quizz object that has highest mark
            for (Quiz temp : record) {
                System.out.println(temp);
                if (highest < temp.getMark()) {
                    highest = temp.getMark();
                    index = record.indexOf(temp);
                }
            }

            System.out.println("\nHighest mark obtained by:\n" + record.get(index));

        } catch (IOException e) {
            System.out.println("File Not Found!");
        }

        System.out.println("");

    }

}
