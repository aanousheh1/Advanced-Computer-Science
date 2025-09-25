public class Line {
    private int a, b, c;

    
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
        double calculateSlope = (double)a/b;
        return calculateSlope;

    }


    public boolean is CoordinatedOnline(intx, inty) {
        

    }

    public String toString() {
        return a + "x" + b + "y" + "=" + c; 
    }


     public boolean equals(Line other) {
        if (this.a == other.a && this.b == other.b) {
            return true;
        } else {
            return false;
        }
    }
}

