
import java.util.*;

class SyncChat {

    boolean flag = false;

    public synchronized void Person_A(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Waiting" + msg);
        flag = true;
        notify();
    }

    public synchronized void Person_B(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Waiting!" + msg);
        flag = false;
        notify();
    }
    
        public synchronized void Person_C(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("C: " + msg);
        flag = true;
        notify();
    }
}

class T1 implements Runnable {

    Scanner in = new Scanner(System.in);
    SyncChat m;
    //String[] s1 = {"Hi", "How are you ?", "I am also doing fine!"};

    public T1(SyncChat m1) {
        this.m = m1;
        new Thread(this, "Person_A").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            m.Person_A(in.nextLine());
        }
    }
}

class T2 implements Runnable {

    Scanner in = new Scanner(System.in);
    SyncChat m;
    //String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    public T2(SyncChat m2) {
        this.m = m2;
        new Thread(this, "Person_B").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            m.Person_B(in.nextLine());
        }
    }
}


public class SyncThreadChat {

    public static void main(String[] args) {
        SyncChat m = new SyncChat();
        new T1(m);
        new T2(m);
        
    }
}
