// Section 2 -- Q2
package Moon;

import java.lang.Runnable;

public class EVEN implements Runnable {

    public EVEN() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("EVEN: " + i);
            }

        }
    }

    @Override
    public void run() {

    }

}
