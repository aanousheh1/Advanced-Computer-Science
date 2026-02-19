public class DogTester {

    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        Dog1 dog2 = new Dog1("John", "Jonah", 1, 425);
        Dog1 dog3 = new Dog1("Chris", "Maria", 5, 456);

        System.out.println("Dog 1 Name, Age, Owner Name, ID, Character, Tag, Location: " + dog1.getName() + " "
                + dog1.getOwnerName() + " " + dog1.getAge() + " " + dog1.getDogId()
                + " " + dog1.getDogTag() + " " + dog1.getDogChar() + " " + dog1.isStillInFacility());
        System.out
                .println("Dog 2 Name, Age, Owner Name, ID, Character, Tag, Still in Facillity?: " + dog2.getName() + " "
                        + dog2.getOwnerName() + " " + dog2.getAge()
                        + " " + dog2.getDogId() + " " + dog2.getDogTag() + " " + dog2.getDogChar() + " "
                        + dog2.isStillInFacility());
        System.out.println("Dog 3 Name, Age, Owner Name, ID, Character, Tag, Location: " + dog3.getName() + " "
                + dog3.getOwnerName()
                + " " + dog3.getAge() + " " + dog3.getDogId() + " " + dog3.getDogTag() + " " + dog3.getDogChar() + " "
                + dog3.isStillInFacility());

        int dogId = 123;
        int age = 4;
        System.out.println("New Id and age for Dog 2: ");
        dog2.setDogId(dogId);
        dog2.setAge(age);
        dog2.setDogTag(PawesomeUtils.generateDogTag(123, PawesomeUtils.generateDogChar(123)));
        dog2.setStillInFacility(false);

        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(456));
        System.out.println(PawesomeUtils.generateDogChar(789));

        System.out.println(PawesomeUtils.generateDogTag(123, PawesomeUtils.generateDogChar(123)));
        System.out.println(PawesomeUtils.generateDogTag(456, PawesomeUtils.generateDogChar(456)));
        System.out.println(PawesomeUtils.generateDogTag(789, PawesomeUtils.generateDogChar(789)));

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Are Dog 2 and Dog 3 the same: " + dog2.equals(dog3));
        System.out.println("Are Dog 2 and Dog 1 the same: " + dog2.equals(dog1));

        System.out.println(PawesomeUtils.pickup(dog3, "Maria"));
        System.out.println(PawesomeUtils.pickup(dog2, "John"));

        PawesomeUtils.checkIn(dog2, "Jonah");

        System.out.println(PawesomeUtils.validateDogId(199));
        System.out.println(PawesomeUtils.validateDogId(50));

        System.out.println(PawesomeUtils.validateDogTag(dog1));
        System.out.println(PawesomeUtils.validateDogTag(dog2));
        System.out.println(PawesomeUtils.validateDogTag(dog3));

        System.out.println(PawesomeUtils.convertAgeToDogYears(15));
        System.out.println(PawesomeUtils.convertAgeToDogYears(24));
        System.out.println(PawesomeUtils.convertAgeToDogYears(49));

        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog1));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog2));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog3));

    }

}
