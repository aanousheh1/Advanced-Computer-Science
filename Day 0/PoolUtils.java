public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel >= 0 && cleanlinessLevel <= 10 ) {
            return cleanlinessLevel;
        } else if (cleanlinessLevel > 10) {
            return 10;

        } else {
            return 0;
        }


    }

    public static String generateUsername(String name) {
        int space1 = name.indexOf(" ");
        String firstName = name.substring(0, space1);
        String lastName = name.substring(space1 + 1);
        String lowName = firstName.toLowerCase();
        String lowName2 = lastName.toLowerCase();
        int ranNum = (int) ((Math.random() * 1000) + 1950); 
        return "\"@" + lowName + "_" + lowName2+ ranNum + "\"";

    }

    public static void cleanPool(Pool pool) {
        int ogLevel = pool.getCleanlinessLevel();
        pool.setCleanlinessLevel(ogLevel + 2);

    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        int space = trimmedName.indexOf(" ");
        String name1 = name.substring(space);
        String name2 = name.substring(0, space);
        String fullyTrimmedName = name1.trim();
        return "\"" + name2 + fullyTrimmedName + "\""; 
    }

    
}
