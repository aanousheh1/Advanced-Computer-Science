public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        char dogChar = (char) ('F' + (((dogId % 10) + ((dogId / 10) % 10) + ((((dogId / 10) / 10) %  10))) % 10));
        return dogChar; 


    }

    public static String pickup(Dog dog, String personName) {
        String ownersName = dog.getOwnerName();
        String name = dog.getName();
        if (ownersName.equals(personName)) {
            dog.setStillInFacility(false);
            return name + " has been picked up by their owner " + personName;
        } else {
            return name + "is not your dog and you cannot pick it up";
        }

    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setOwnerName(personName);
            dog.setStillInFacility(true);
            System.out.println(dog.getName() + " was checked in by " + personName);

        } else {
            dog.setStillInFacility(false);
            System.out.println(dog.getName() + " is considered a counterfeit dog and is denied entry to the daycare. ");
        }
        

    


    }

    public static String generateDogTag(int dogId, char dogChar) {
        String generateDogTag = dogId + "" + dogChar;
        return generateDogTag;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 901) + 99;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int oldId = dog.getDogId();
        int newId = validateDogId(oldId);
        char letter = generateDogChar(newId);
        String newDogTag = "" + newId + letter;
        String oldTag = dog.getDogTag();
        if (newDogTag.equals(oldTag)) {
            return true;
        } else {
            return false;
        }

    }

    public static int convertAgeToHumanAge(Dog dog) {
        int age = dog.getAge();
        if (age == 1) {
            return 15;
        }
        if (age == 2) {
            return 24;
        } else {
            return 24 + (5 * (age - 2));
        }

    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;

        }
        if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 3;
        }

    }



}