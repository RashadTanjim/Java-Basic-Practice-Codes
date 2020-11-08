
class MyThread1 extends Thread {

    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        /* Line 5 */
        t.run();
        /* Line 6 */
    }

    @Override
    public void run() {
        for (int i = 1; i < 3; ++i) {
            System.out.print(i + "..");
        }
    }
}
