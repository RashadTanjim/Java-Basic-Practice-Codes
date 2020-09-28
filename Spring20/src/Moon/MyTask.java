//3.
package Moon;

import java.lang.Runnable;

public class MyTask implements Runnable {

    private int interval;
    private String name;

    MyTask(String name, int interval) {
        this.interval = interval;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= interval; i++) {
            System.out.println("Displaying " + i + " from " + toString());
        }

    }

    @Override
    public String toString() {
        return name;
    }

}
