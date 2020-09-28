//3.b
public class C {

    public static void main(String[] args) {
        B b = new B(1);
    }
}

//3.a
//RuntimeException aries while compiling the following codes.
//The class A has a variable x, after extending A class to B class,
//it si needed to add class A's instance to the constructor 
//which is missing form Class B's construcctor. And in the main method class C, 
//after creating object of B, it is needed to pass a variable for the x in the class A. 