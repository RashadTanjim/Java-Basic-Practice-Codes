package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class File_IO {

    public static void main(String[] args) {
        try {
            File myObj = new File("myfile1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
            if (myObj.exists()) {
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable: " + myObj.canRead());
                System.out.println("File size in bytes: " + myObj.length());
            } else {
                System.out.println("The file does not exists");
            }
            //file writing starts
            FileWriter myWriter = new FileWriter("myfile1.txt");
            myWriter.write("Files in Java is tricky but it is fun");
            myWriter.close();
            //file writing ends

            System.out.println("Succesfully written");
            System.out.println("File size in bytes: " + myObj.length());

            BufferedReader br = null;
            BufferedReader br2 = null;
            br = new BufferedReader(new FileReader("myfile1.txt"));

            //reading the file using readLine() method
            System.out.println("reading the file using readLine() method");
            String content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
            br2 = new BufferedReader(new FileReader("myfile1.txt"));
            //reading file using read() method
            System.out.println("reading file using read() method");
            int number = 0;
            char ch;
            while ((number = br2.read()) != -1) {
                ch = (char) number;
                System.out.print(ch);
            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }

    }

}
