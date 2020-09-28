// Section 2 -- Q2

package Moon;

public class Driver2 {

    public static void main(String[] args) {
        ODD odd = new ODD();
        Thread t1 = new Thread(odd);
        t1.start();

        EVEN even = new EVEN();
        Thread t2 = new Thread(even);
        t2.start();

    }
}
