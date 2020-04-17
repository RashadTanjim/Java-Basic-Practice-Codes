/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peyash
 */
public class ProblemThree {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File source = new File("file.txt");
        File destination = new File("anotherFile.txt");
        
        ArrayList<String> list = new ArrayList<String>();
        
        Scanner scan = new Scanner(source);
        
        while(scan.hasNext()){
            list.add(scan.nextLine());
        }
        
        scan.close();
        
        FileWriter writer = new FileWriter(destination);
        
        for(int i = list.size()-1; i>=0; i--){
            for(int j = list.get(i).length()-1; j>=0; j--){
                writer.write(list.get(i).charAt(j));
            }
            
            writer.write("\r\n");
        }
        
        writer.close();
        
       
    }
}
