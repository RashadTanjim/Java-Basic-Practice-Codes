
class s1 implements Runnable {

    int x = 0, y = 0;

    int addX() {
        x++;
        return x;
    }

    int addY() {
        y++;
        return y;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(addX() + " " + addY());
        }
    }

    public static void main(String args[]) {
        s1 run1 = new s1();
        s1 run2 = new s1();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }
}
