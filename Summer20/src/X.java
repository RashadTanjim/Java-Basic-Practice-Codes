///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author arnob
// */
//class X {
//
//    public X(int i) {
//        System.out.println(1);
//    }
//}
//
//class Y extends X {
//
//    public Y() {
//        System.out.println(2);
//    }
//}

//class X {
//
//    public X(int i) {
//        System.out.println(1);
//    }
//}
//class Y extends X {
//
//    public Y(int i){
//        super(i);
//        System.out.println(2);
//    }
//}
class X implements Runnable {

    public static void main(String args[]) {
        /* Missing code? */
        X t = new X();
        Thread t1 = new Thread(t);
        t1.start();
    }

    @Override
    public void run() {
         System.out.print("Thead is Running..");
    }
}
