
public class TestPoint {

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        //System.out.println(point1.distance(point2));
        System.out.println("Distance between " + point1.toString() + "&"
                + point2.toString() + " is: ");
        System.out.printf("%.4f\n", point1.distance(point2));

    }

}
