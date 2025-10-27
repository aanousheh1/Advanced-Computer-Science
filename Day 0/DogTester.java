public class DogTester {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("John", "Jonah", 11, 543);
        Dog dog3 = new Dog( "Chris", "Leo", 5, 693);
        Dog dog4 = new Dog("John", "Jonah", 11, 543);
        
        System.out.println("Dog 1 Name, Age, Owner Name, ID, Character, Tag, Location: " + dog1.getName() +  " " +  dog1.getOwnerName() + " " +  dog1.getAge() +  " " + dog1.getDogId() 
        + " " + dog1.getDogTag() +  " " + dog1.getDogChar() + " " + dog1.isStillInFacility()  );
        System.out.println("Dog 2 Name, Age, Owner Name, ID, Character, Tag, Still in Facillity?: " + dog2.getName() +  " " +  dog2.getOwnerName() + " " +  dog2.getAge() 
        +  " " + dog2.getDogId() + " " + dog2.getDogTag() +  " " + dog2.getDogChar() + " " + dog2.isStillInFacility()  );
        System.out.println("Dog 3 Name, Age, Owner Name, ID, Character, Tag, Location: " + dog3.getName() +  " " +  dog3.getOwnerName()
         + " " +  dog3.getAge() +  " " + dog3.getDogId() + " " + dog3.getDogTag() +  " " + dog3.getDogChar() + " " + dog3.isStillInFacility());
        
        int dogId = 123; 
        int age = 4;
        System.out.println("New Id and age for Dog 2: ");
        dog2.setDogId(dogId);
        dog2.setAge(age);

        System.out.println(dog2.generateDogChar());
        System.out.println(dog3.generateDogChar());
        System.out.println(dog1.generateDogTag());
        System.out.println(dog2.generateDogTag());
        System.out.println(dog3.generateDogTag());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Are Dog 2 and Dog 3 the same: " + dog2.equals(dog3));
        System.out.println("Are Dog 2 and Dog 4 the same: " + dog2.equals(dog4));

    
    }  


}
