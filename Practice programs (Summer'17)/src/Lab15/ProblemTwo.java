/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peyash
 */
public class ProblemTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("records1.txt");
        //create records.txt manually with some data
        
        //this ArrayList stores quizz objects
        ArrayList<Quizz> record = new ArrayList<Quizz>();
        
        Scanner scan = new Scanner(f);
        
        while(scan.hasNext()){
            String id = scan.next();
            float mark = Float.parseFloat(scan.next());
            
            record.add(new Quizz(id, mark));
        }
        
        scan.close();
        
        float highest = 0;
        int index = 0;
        
        //determines index of the Quizz object that has highest mark
        for(Quizz temp: record){
            if(highest < temp.getMark()){
                highest = temp.getMark();
                index = record.indexOf(temp);
            }
        }
        
        System.out.println(record.get(index));
    }
    
}
