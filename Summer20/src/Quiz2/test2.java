package Quiz2;
class X {

    public X(int i) {
        System.out.println(1);
    }
}
class Y extends X {

    public Y(int i) {
        super(i);
        System.out.println(2);
    }
}
public class test2 {

    public static void main(String[] args) {
        Y b = new Y(1);
    }
}
