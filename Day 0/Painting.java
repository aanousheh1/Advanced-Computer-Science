public class Painting {
    // red dots
    // sand dune
    // a wagon
    // craters
    // a sun

    private int numreddots; // = 10
    private int price; 
    private String paintingLocation; // = "sand dunes"
    private double widthofdots_inches; //  = 1.5
    private boolean iscool; // = true
    private double height_feet; // = 2
    char paintinggrade; // = 'A'

    public Painting() {
        numreddots = 10;
        Paintinglocation = "sand dunes";
        Widthofdots_inches = 1.5;
        iscool = true;
        height_feet = 2;
        paintinggrade = 'A';
    }
    //public_WhatComesOUT_ _nameOfFunction_(_inputs_) {    
    // inspect
    
    public void bid(int bidPrice) {
        if (bidPrice < 100){
            System.out.println("The bid has to be greater than 100 dollars!");
        }
        else {
            System.out.println("Thanks for submitting a bid. We will let you know if you win!");
        }

        
        }

    }



    public void measure () {
        height_feet = 2;
        System.out.println("The height of this painting in feet is" );
        System.out.println(height_feet);
        
    }

    public void inspect () {
        numreddots = 10;
        System.out.println("The number of dots are" );
        System.out.println(numreddots);
    }

    public void location () {
         Paintinglocation = "sand dunes";
         System.out.println("This painting is located in" );
         System.out.println(Paintinglocation);

    }
    public void buy () {
        price = 100;
        System.out.println("The cost of this painting is" );
        System.out.println(price);

    }

    // admire
    // sell
    // buy
    public static void main() {

    }
}