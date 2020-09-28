//7.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class ManagemntCttee extends Society {

    ArrayList<String> Cttee = new ArrayList<String>();
    private int numCttee; // Number of Cttee 

    public ManagemntCttee(String name) {
        super(name);
        numCttee = 0;
    }

    @Override
    public void addCtteeMember(SeniorMember s) {
        Cttee.add(s.getName());
        numCttee++;
    }

    public void removeCtteeMember(String name) {

        if (Cttee.equals(name)) {
            Cttee.remove(name);
        } else {
            System.out.println("Wrong Input!");
        }

        numCttee--;
    }

    public int numberOfCttee() {
        return numCttee;
    }
}
