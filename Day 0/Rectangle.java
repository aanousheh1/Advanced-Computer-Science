public class Rectangle {
    private int length;
    private int width;

    // constructors
    
    // general default constructor
    

    public Rectangle() {
        // Initialize the private instance variables
        length = 5;
        width = 3;
    }

    // define the instance variables with the local parmeters
    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    //getters
    public int getLength() {
        return length; 
    }

    public int getWidth() {
        return width; 
    }

    // setters
    public void setLength(int newLength) {
        length = newLength

    }
    public void setWidth(int newWidth) {
        width = newWidth
    }

    // methods
    public int calculateArea() {
        calculateArea = length * width
    }

    public int calculatePerimeter() {
        calcualtePerimeter = (length * 2) + (width * 2)
    }

    public int calculateDiagonal() {

    }
}
