package Lab7;
import java.util.*;
/**
 * Md Rashad Tanjim
 * ID: 1620952042
 * LAB-7 Task
 */
public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;

    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double length() {
        return (start.distance(end));
    }
}
