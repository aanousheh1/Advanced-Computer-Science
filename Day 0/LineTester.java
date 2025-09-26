public class LineTester {
    // Testing Line 1
    public static void main(String[] args) {
        Line line1 = new Line(5, 4, -17);
        System.out.println(line1.getA());
        System.out.println(line1.getB());
        System.out.println(line1.getC());
        double slope1 = line1.calculateSlope();
        System.out.println(slope1);


        // slope1 should be -1.25 
        // Should be true, as 5(5) + 4(-2) + (-17) = 0
        boolean onLine1 = line1.isCoordinateOnLine(5, -2); 
        System.out.println(onLine1);

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        System.out.println(line2.getA());
        System.out.println(line2.getB());
        System.out.println(line2.getC());
        double slope2 = line2.calculateSlope(); 
        System.out.println(slope2);

     
        boolean onLine2 = line2.isCoordinateOnLine(5,  -2); 
        System.out.println(onLine2);

        Line line3 = new Line(12, -6, 20);
        System.out.println(line3.getA());
        System.out.println(line3.getB());
        System.out.println(line3.getC());
        double slope3 = line3.calculateSlope(); 
        System.out.println(slope3);

     
        boolean onLine3 = line3.isCoordinateOnLine(2, -1); 
        System.out.println(onLine3);


        Line line4 = new Line(-5, 4, 15);
        System.out.println(line4.getA());
        System.out.println(line4.getB());
        System.out.println(line4.getC());
        double slope4 = line4.calculateSlope(); 
        System.out.println(slope4);

     
        boolean onLine4 = line4.isCoordinateOnLine(-1, 1); 
        System.out.println(onLine4);


    }
    
}
