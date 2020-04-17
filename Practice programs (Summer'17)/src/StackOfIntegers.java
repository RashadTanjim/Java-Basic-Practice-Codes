
public class StackOfIntegers {

    int[] element;
    int size;
    public static final int CAPACITY = 16;

    public StackOfIntegers() {
        this(CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        element = new int[capacity];
        size = 0;
    }

    public int Push(int value) {
        element[size] = value;
        size++;
        return 0;
    }

    public int Pop() {
        --size;
        return element[size];
    }

    public int Peek() {
        return element[size - 1];
    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

}
