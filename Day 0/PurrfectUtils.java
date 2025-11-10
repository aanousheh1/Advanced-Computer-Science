public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        int mood = cat.getMoodLevel();
        String name = cat.getName();
        if (mood > 7 && mood <= 10) {
            return "Currently, " + name  + "is in a great mood. /nPetting is appreciated.";
        } else if (mood > 3 && mood <=7) {
            return "Currently, " + name  + "is reminiscing of a past life /nPetting is acceptable.";
        } else {
            return "Currently, " + name  + "is poltting revengeance. /nPetting is extremely risky.";
        }

    }

    public static char generateCatChar(String catId) {
        int sumOfDigits = 0;
        for (int i = 0; i < catId.length(); i++) {
            char digit = catId.charAt(i);
            String num1 = String.valueOf(digit);
            int number = Integer.parseInt(num1);
            sumOfDigits = sumOfDigits + number;
        }
        char value = (char) ('A' + (sumOfDigits % 26));
        return value;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low >= high) {
            int newLow = low;
            low = high;
            high = newLow;
        }
        int ranNum  = (int) (Math.random() * (high - low)) + low; 
        return ranNum; 

    }

    public static String validateCatId(String catId) {
        int id = Integer.parseInt(catId);
        if (id >= 1000 && id <= 9999) {
            return catId;
        } else {
            int randomId = (int) (Math.random() * 9000) + 1000;
            return String.valueOf(randomId);
        }

    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }

    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        int ogMood = cat.getMoodLevel();
        if (ogMood >= 2) {
            cat.setMoodLevel(ogMood + 1);
            System.out.println("Petting Successful!");

        } else if (ogMood < 2 && cat.isHungry()) {
            cat.setMoodLevel(ogMood - 1);
            System.out.println("Petting Failed...");

        } else {
            cat.setMoodLevel(ogMood + 1);
            System.out.println("Petting Successful!");
        }

    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int ogMood = cat.getMoodLevel();
        int numDecrease = (int) (Math.random() * 2) + 1;
        if (numDecrease == 1) {
            cat.setMoodLevel(ogMood - 1);
            System.out.println(cat.getName() + " did not like that...");
        }
        if (numDecrease == 2) {
            cat.setMoodLevel(ogMood - 2);
            System.out.println(cat.getName() + " really hated that!");

        }


    }

    public static void cleanLitterBox(Cat cat) {
        int ogMood = cat.getMoodLevel();
        System.out.println("Cleaning the litter box... \nDone! \n Cookie appreciated that.");
        cat.setMoodLevel(ogMood + 1);
        cat.setHungry(true);

    }

    public static void feed(Cat cat) {
        int ogMood = cat.getMoodLevel();
        System.out.println("Filling up " + cat.getName() + "'s bowl.../nDone! /n" + cat.getName() + "is eating..."
            + cat.getName() + "is full!");
        cat.setMoodLevel(ogMood + 2);
        cat.setHungry(false);
        
    }

}
