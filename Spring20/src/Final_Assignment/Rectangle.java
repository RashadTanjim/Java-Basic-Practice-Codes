//1.
/**
 * Final Assignment
 * Submission Last Date: 04.06.20
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package Final_Assignment;

import java.util.*;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

}
