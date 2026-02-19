public class Square extends Rectangle {

    public Square(double sideLength) {
        super(sideLength, sideLength);

    }

    public Square() {
        super(4, 4);
    }

    public String toString() {
        String s = super.toString();
        return s + "\nIt is also a square.";
    }

}
