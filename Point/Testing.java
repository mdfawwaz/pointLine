package projectOne;

public class Testing {
    public static void main(String[] args) {
        Line line1 = new Line(3, 9);
        Line line2 = new Line(5, 10);

        Point origin = new Point(0, 0);
        Point intersectionPoint = line1.intersection(line2);

        double distanceToIntersection = origin.distanceFrom(intersectionPoint);
        System.out.println("Distance : " + distanceToIntersection);
    }
}
