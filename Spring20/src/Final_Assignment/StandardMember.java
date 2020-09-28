//7.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class StandardMember extends Member {

    public StandardMember(String societyName, String name, String address) {
        super(societyName, name, address);
    }

    @Override
    public int getFee() {
        return 100;
    }
}
