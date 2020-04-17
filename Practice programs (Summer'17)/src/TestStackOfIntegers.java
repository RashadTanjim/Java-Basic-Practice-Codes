
public class TestStackOfIntegers {

    public static void main(String[] args) {
        StackOfIntegers s1 = new StackOfIntegers();
        for (int i = 0; i < 10; i++) {
            s1.Push(i);
        }
        if (!s1.isEmpty()) {
            System.out.println(s1.Pop());
        } else {
            System.out.println("Not Empty!");
        }
    }

}
