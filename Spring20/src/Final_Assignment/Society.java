//7.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class Society {

    private String societyName;
    ArrayList<String> memberName = new ArrayList<String>();
    ArrayList<String> memberAddress = new ArrayList<String>();

    ArrayList<String> sMemberName = new ArrayList<String>();
    ArrayList<String> sMemberAddress = new ArrayList<String>();
    Integer[] Fee = new Integer[10];

    private int numSenior; // Number of Senior Member
    private int numMember;
    private int totalFee;

    public Society(String societyName) {
        this.societyName = societyName;
        numMember = 0;
        numSenior = 0;
    }

    public void addMember(String name, String address) {
        memberName.add(name);
        memberAddress.add(address);
        numMember++;
    }

    public void addSeniorMember(String name, String address, int fee) {
        sMemberName.add(name);
        sMemberAddress.add(address);
        Fee[numSenior] = fee;

    }

    public void addCtteeMember(SeniorMember member) {
        //overridded in ManagemntCttee class and implemented there
    }

    public int getFeeTotal() {

        for (int i = 0; i < Fee.length; i++) {
            totalFee = +Fee[i];
        }
        return totalFee;
    }

    public int numMem() {
        return numMember;
    }
}
