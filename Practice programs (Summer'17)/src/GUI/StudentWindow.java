package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.*;

public class StudentWindow implements ActionListener {

    private JFrame frame;

    private JLabel idL;
    private JLabel nameL;

    private JTextField id;
    private JTextField name;

    private JButton add;
    private JButton search;

    private Student[] students;

    public StudentWindow() {
        students = new Student[50];
        frame = new JFrame();

        idL = new JLabel("ID");
        nameL = new JLabel("NAME");

        id = new JTextField();
        name = new JTextField();

        add = new JButton("ADD");
        search = new JButton("SEARCH BY ID");

        add.addActionListener(this);
        search.addActionListener(this);

        GridLayout g = new GridLayout(3, 2);
        frame.setLayout(g);

        frame.add(idL);
        frame.add(id);
        frame.add(nameL);
        frame.add(name);
        frame.add(add);
        frame.add(search);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 260);
        frame.setLocation(200, 100);

        readFromFile();
    }

    public void readFromFile() { // read the students records from file and store in an array
        try {
            File f = new File("records.txt");
            Scanner s = new Scanner(f);
            students = new Student[50]; // since we don't know the exact number of records, initialize the array to a reasonably sized one
            int i = 0;

            while (s.hasNextLine()) {
                String a = s.nextLine(); // read id;
                String b = s.nextLine(); // read name;
                Student temp = new Student(a, b); // create Student object
                students[i] = temp; // store in array
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeToFile() { // write the student records from array to file
        try {
            File f = new File("records.txt");
            FileWriter fw = new FileWriter(f);

            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    fw.write(students[i].getId()); // write id in one line
                    fw.write("\n");
                    fw.write(students[i].getName()); // write name in another line
                    fw.write("\n");
                }
            }

            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addStudent(Student s) { // adds the student object into array
        // find an available index first
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) { // location available
                index = i;
                break;
            }
        }

        if (index < students.length) {
            students[index] = s;
        }
    }

    public Student findStudent(String key) {
        Student s = null;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(key)) { // id matches
                s = students[i];
            }
        }

        return s;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String i = id.getText();
            String n = name.getText();

            Student temp = new Student(i, n);
            addStudent(temp);
            writeToFile(); // new record created, so write to file
        }

        if (e.getSource() == search) {
            String i = id.getText();
            Student found = findStudent(i);

            if (found != null) { // matching record exists
                name.setText(found.getName());
            } else {
                name.setText("Record not found!");
            }
        }
    }
}
