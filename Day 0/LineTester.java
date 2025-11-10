public class LineTester {
    // Testing Line 1
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        Line pointLine = new Line(p1, p2);
        // System.out.println(pointLine.getA());
        // System.out.println(pointLine.getB());
        // System.out.println(pointLine.getC());
        System.out.println("Using calculateSlope() " + pointLine.calculateSlope());
        System.out.println("Using calculateSlopeFromPoints() " 
            + pointLine.calculateSlopeFromPoints());
        if (pointLine.calculateSlopeFromPoints() == pointLine.calculateSlope()) {
            System.out.println("Do you get the same number... yes!");
        } else {
            System.out.println("Did not get the same number");
        }


        // slope1 should be -1.25 
        // Should be true, as 5(5) + 4(-2) + (-17) = 0
        boolean onLine1 = pointLine.isCoordinateOnLine(p1); 
        System.out.println("Is p1 on the line? " + onLine1);
        System.out.println("Is p2 on the line? " + pointLine.isCoordinateOnLine(p2));
        System.out.println("Is p3 on the line? " + pointLine.isCoordinateOnLine(p3));
        System.out.println("Is p4 on the line? " + pointLine.isCoordinateOnLine(p4));
        

    }
    
}
