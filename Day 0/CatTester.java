public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // add new
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // add new
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // add system.out.println
        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); // add system.out.println
        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); // lowercase i and add system.out.println
        System.out.println("Tabby" + myCat.getBreed());


        String firstName = "Tiger";
        String lastName = "Beast"; // change == to =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name); 
        otherCat.setName(name); // add this line
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}