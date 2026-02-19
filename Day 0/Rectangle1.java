public class Rectangle1 {
    private int length;
    private int width;
    private int area;
    private int perimeter;
    private double diagonal;

    // constructors

    // general default constructor

    public Rectangle1() {
        // Initialize the private instance variables
        length = 5;
        width = 3;
    }

    // define the instance variables with the local parmeters

    public Rectangle1(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    // getters

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        calculateArea();
        return area;
    }

    public double getDiagonal() {
        calculateDiagonal();
        return diagonal;
    }

    public int getPerimeter() {
        calculatePerimeter();
        return perimeter;
    }

    // setters

    public void setLength(int newLength) {
        length = newLength;

    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    // methods

    public int calculateArea() {
        int calculateArea = length * width;
        this.area = calculateArea;
        return calculateArea;
    }

    public int calculatePerimeter() {
        int calculatePerimeter = (length * 2) + (width * 2);
        this.perimeter = calculatePerimeter;
        return calculatePerimeter;

    }

    public double calculateDiagonal() {
        double calculateDiagonal = Math.sqrt((length * length) + (width * width));
        this.diagonal = calculateDiagonal;
        return calculateDiagonal;

    }

    public boolean equals(Rectangle1 other) {
        if (this.length == other.length && this.width == other.width) {
            return true;
        } else {
            return false;
        }
    }
}
