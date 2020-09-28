package Lab7;
import java.util.*;
/**
 * Md Rashad Tanjim
 * ID: 1620952042
 * LAB-7 Task
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+ x + "," + y+")";
    }

    public double distance(Point point) {
        double d = Math.sqrt(Math.pow((x - point.getX()), 2) + Math.pow((y - point.getY()), 2));
        return d;
    }
}
