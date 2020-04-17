
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class GUI_Basic {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Enter a Number");
        String t = JOptionPane.showInputDialog(null, "Enter a txt", "New Title", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(s);
        long x = Long.parseLong(s);
        double d = Double.parseDouble(s);
        System.out.println(d);

        JOptionPane.showMessageDialog(null, "Nothing to Disply");
        JOptionPane.showMessageDialog(null, "Title has been changed", "New Title", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Do you want to continue");
        System.out.println();

        int option = 0;
        while (option == JOptionPane.YES_OPTION) {
            System.out.println("continue loop");
            option = JOptionPane.showConfirmDialog(null, "Continue?");
        }

    }
}
