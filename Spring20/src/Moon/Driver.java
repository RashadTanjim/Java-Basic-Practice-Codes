
package Moon;

public class Driver {
        public static void main(String[] args) {  
        MyTask A = new MyTask("A", 40);  
        Thread t1= new Thread(A);  
        t1.start(); 
        
        MyTask B = new MyTask("B", 40);  
        Thread t2= new Thread(B);  
        t2.start(); 
    }

}
