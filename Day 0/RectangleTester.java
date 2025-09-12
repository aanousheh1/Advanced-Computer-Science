public class RectangleTester {
    public static void main(String[] args) {
        // Declaration: type name
        // Instantiation/initialization = new type()

        System.out.println("Hello world!");
        Rectangle joe = new Rectangle();
      
        Rectangle samuel = new Rectangle(4, 10);
    

        System.out.println("testing getWidth" + joe.getWidth()); 
        System.out.println("testing getLength" + samuel.getLength()); 
        System.out.println("Testing setLength at first, length is " + samuel.getLength());
        System.out.println("Testing area" + samuel.calculateArea());
        System.out.println("Testing area" + samuel.getArea());
        System.out.println("Testing perimeter" + samuel.calculatePerimeter());
        System.out.println("Testing perimeter" + samuel.getPerimeter());
        System.out.println("Testing diagonal" + samuel.calculateDiagonal());
        System.out.println("Testing diagonal" + samuel.getDiagonal());
        System.out.println(joe.equals(samuel));
        
        
        //stout.getLength()); stout.set
        
    }



}

  

