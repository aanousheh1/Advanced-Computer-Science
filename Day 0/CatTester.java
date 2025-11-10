public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat("John", "Sarah", 4, "1185" );

        cat1.setCatChar('Q');
        cat1.setCatId("1623");
        cat1.setMoodLevel(6);
        cat1.setOwnerName("Olivia");

        System.out.println(cat1.generateCatTag());
        System.out.println(cat1.getCatChar());

        Cat cat2 = new Cat("Jonah", "Ruby", 7, "1865");

        System.out.println(cat1.equals(cat2));

        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(cat1);
        }

        PurrfectUtils.bootUp(cat1);
        PurrfectUtils.bootUp(cat2);

        PurrfectUtils.pet(cat1);
        PurrfectUtils.pet(cat2);

        PurrfectUtils.cleanLitterBox(cat1);
         PurrfectUtils.cleanLitterBox(cat2);

        PurrfectUtils.feed(cat1);
        PurrfectUtils.feed(cat2);

        



    }
    
}
