//7.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class SeniorMember extends Member{

    private int fee;

    public SeniorMember(String societyName, String name, String address, int fee)
    {
        super(societyName, name, address);
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }
    
}
