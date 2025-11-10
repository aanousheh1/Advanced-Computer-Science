public class Line {

    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY());
        this.b = p2.getX() - p1.getX();
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    } 
     

    public void setC(int c) {
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }




    public double getSlope() {
        double slope = calculateSlope();
        return slope;
    } 


    public double calculateSlope() {
        double calculateSlope = -1 * ((double) a / b);
        return calculateSlope;

    }


    public boolean isCoordinateOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        } else {
            return false;
        }


        

    }

    public String toString() {
        return a + "x" + b + "y" + "=" + c; 
    }


    public boolean equals(Line other) {
        if (this.a ==  other.a && this.b ==  other.b) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateSlopeFromPoints() {
        double slope = (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return slope;
    }

    public String generatePointSlopeFormula() {
        return "(y - " +  p1.getY() + ") = " + (double) 
            (p2.getY() - p1.getY()) / (p2.getX() - p1.getX()) 
            + "(x - " + p1.getX() + ")";
    }




}

