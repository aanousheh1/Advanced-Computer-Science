public class Unit1Exercises {
    public static String helloName(String name) {
        return "\n Hello " + name + "!\n";
    }

   
    public static String makeOutWord(String out, String word) {
        String firstOut = out.substring(1,3);
        String secondOut = out.substring(3);

        return "\n" + firstOut + word + secondOut + "\n";
    }

    
    public static String withoutEnd(String str) {
        int length = str.length();
        if (length > 2) {
            String newStr = str.substring((length - (length - 1)), length - 1);
            return "\n" + newStr + "\n";

        } else {
            return "\n" + str + "\n";
        }

    
    }

   
    public static String comboString(String a, String b) {
        int length1 = a.length();
        int length2 = b.length();
        if (length1 == 0 || length2 == 0) {
            return "";
        } else if (length1 > length2) {
            return "\n" + b + a + b + "\n";
        } else {
            return "\n" + a + b + a + "\n";
        }
        
    }

  
    public static String left2(String str) {
        int length = str.length();
        if (length > 2) {
            String newStr = str.substring(0, length - (length - 2));
            String newStr2 = str.substring((length - (length - 2)));
            return "\n" + newStr2 + newStr + "\n";

        } else {
            return "";
        }
        
    }

    public static String middleThree(String str) {
        int length = str.length() / 2;
        String newStr = str.substring(length - 1, length + 2);
        return "\n" + newStr + "\n";
    }

  
    public static String withoutEnd2(String str) {
        int length = str.length();
        if (length > 2) {
            String newStr = str.substring((length - (length - 2)), length);
            return "\n" + newStr + "\n";

        } else {
            return "\n" + str + "\n";
        }
    }

  
   
    public static String stringEnds(String str, int n) {
        int length = str.length();
        String str1 = str.substring(0, n + 1);
        String str2 = str.substring(length - n);

        return "\n" + str1 + str2 + "\n";
    }

    public static boolean hasBad(String str) {
        int a = str.indexOf("bad");
        if (a == 1 || a == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static int countVowels(String input) {
        int numOccurences = 0;
        for (int i = 0; i < input.length(); i++ ) {
            char vowel = input.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel =='u' ) {
                numOccurences++;
            }

        }

        return numOccurences;
    }

  
    public static int countCode(String str) {
        int codeOccurences = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            String code = str.substring(i, i + 2);
            char e = str.charAt(i+3);
            if (code.equals("co")  && e == 'e') {
                codeOccurences++;
            }
        }
        return codeOccurences;
    }

}

    

