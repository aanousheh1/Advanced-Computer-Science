public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";

    }

    public static int indexOfFirstSpace(String name) {
        int index = name.indexOf(" ");
        return index;
    }

    public static int indexOfSecondSpace(String name) {
        int space1 = indexOfFirstSpace(name);
        String stringAfterSpace = name.substring(space1 + 1);
        int space2 = stringAfterSpace.indexOf(" ");
        if (space1 == -1 || space2 == -1) {
            return -1; 
        } else {
            return space1 + 1 + stringAfterSpace.indexOf(" ");
        }

    }

    public static String findFirstName(String name) {
        int space1 = indexOfFirstSpace(name);
        if (space1 == -1) {
            return name;
        } else {
            String stringBeforeSpace = name.substring(0, space1);
            return stringBeforeSpace;
        }


    }

    public static String findLastName(String name) {
        int space1 = indexOfFirstSpace(name);
        int space2  = indexOfSecondSpace(name);
        if (space1 == -1 && space2 == -1) {
            return "";
        } else if (space2 == -1) {
            String stringAfterSpace = name.substring(space1 + 1);
            return stringAfterSpace;
        } else {
            String stringAfterSpace2 = name.substring(space2 + 1);
            return stringAfterSpace2;
        }
        
    }

    public static String findMiddleName(String name) {
        int space1 = indexOfFirstSpace(name);
        int space2  = indexOfSecondSpace(name);
        if (space2 != -1) {
            String stringBetweenSpaces = name.substring(space1 + 1, space2);
            return stringBetweenSpaces;
        } else {
            return "";
        }

    }

    public static String generateLastFirstMidInitial(String name) {
        int space1 = indexOfFirstSpace(name);
        int space2  = indexOfSecondSpace(name);
        if (space1 == -1 && space2 == -1) {
            return name;
        } else if (space1 != -1 && space2 == -1) {
            String stringAfterSpace = name.substring(space1 + 1);
            String stringBeforeSpace = name.substring(0, space1);
            return stringAfterSpace + ", " + stringBeforeSpace;
        } else {
            String stringBeforeSpace = name.substring(0, space1);
            String stringMiddleInitial = name.substring(space1 + 1, space1 + 2);
            String stringAfterSpace2 = name.substring(space2 + 1);
            return stringAfterSpace2 + ", " + stringBeforeSpace + " " + stringMiddleInitial + ".";
        }

    }






}







     
