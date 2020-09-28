public class Implicit_explicit_casting {

    public static void main(String[] args) {
        //explicit type casting
        double d = 100.04;
        long l = (long)d;  //explicit type casting required
        int i = (int)l; //explicit type casting required
        System.out.println("Int value "+i);
        
        //implicit type casting 
        m(new GraduateStudent()); 
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x) {
        System.out.println(x.toString());
    }
}
class GraduateStudent
        extends Student {
}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}
class Person extends Object {
    public String toString() {
        return "Person";
    }
}

/*
Implicit Casting:
The statement Object o = new Student(), known as implicit casting, 
is legal because an instance of Student is automatically an instance of Object.

Explicit Casting:
When you are assigning a larger type value to a variable of smaller type, 
then you need to perform explicit type casting. I
*/
