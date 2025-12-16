public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation == true && day == 0 || day == 6) {
            return "off";

        } else if (vacation == false && day > 0 && day < 6) {
            return "7:00";
        } else {
            return "10:00";
        }

    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (Math.abs(a - b) == 6 || a + b == 6) {
            return true;
        }
        return false; 

    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10; 
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }

    }

    public static String fizzString(String str) {
        if (str.length() > 0 && str.indexOf('f') == 0 && str.indexOf('b') != str.length() - 1) {
            return "Fizz";
        } else if (str.length() > 0 && str.indexOf('b') == str.length() - 1 
            && str.indexOf('f') != 0) {
            return "Buzz";
        } else if (str.length() > 0 && str.indexOf('f') == 0 
            && str.indexOf('b') == str.length() - 1) {
            return "FizzBuzz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            String letter = String.valueOf(str.charAt(i));
            letter = letter + letter;
            out = out + letter;
        }
        return out; 
        
    }
    

    public static int countHi(String str) {
        int occurences = 0; 
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                occurences += 1; 
            }
        }
        return occurences;
    }

    public static boolean catDog(String str) {
        int occurences = 0; 
        int occurences2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                occurences += 1; 
            }
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                occurences2 += 1; 
            }
        }
        
        if (occurences ==  occurences2) {
            return true;
        } else {
            return false; 
        }
       


    }

    public static String mixString(String a, String b) {
        String out = "";
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                char letter1 = a.charAt(i);
                char letter2 = b.charAt(i);
                out = out + letter1 + letter2;
            }

        } else {
            for (int i = 0; i < a.length(); i++) {
                char letter1 = a.charAt(i);
                char letter2 = b.charAt(i);
                out = out + letter1 + letter2;
            }

        }
        

        if (a.length() > b.length()) {
            return out + a.substring(b.length());
        } else if (a.length() < b.length()) {
            return out + b.substring(a.length());
        } else {
            return out;
        }
    }

    public static String repeatEnd(String str, int n) {
        String out = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + out;
        }
        return result; 

    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() == 0 || b.length() == 0) {
            return true;
        }
        if (a.length() > b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (b.equals(a.substring(i))) {
                    return true;
                }

            }
        } else {
            for (int i = 0; i < b.length(); i++) {
                if (a.equals(b.substring(i))) {
                    return true;
                }
            
            }
        }
        return false;
    }

    public static int countCode(String str) {
        int occurences = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                occurences += 1;
            }
        }
        return occurences;
    }

    public static int countEvens(int [] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even += 1;
            }
        }
        return even;

    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return max - min;


    }

    public static int sum13(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            }
        }
        return sum; 

    }

    public static int[] fizzArray(int n) {
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = i;
        }
        return out; 
    }

    public static boolean haveThree(int[] nums) {
        int occurences = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] != 3) {
                occurences += 1;
            } else if (i > 0 && nums[i] == 3 && nums[i - 1] != 3) {
                occurences += 1;
            }
        }
        if (occurences == 3) {
            return true;
        } else {
            return false; 
        }
    }

    public static String[] fizzArray2(int n) {
        String[] output = new String[n];
        for (int i = 0; i < n; i++) {
            output[i] = String.valueOf(i);
        }
        return output; 


    }

    public static int[] zeroFront(int[] nums) {
        int[] out = new int[nums.length];
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                out[zero] = 0;
                zero += 1;
            } 
            
        }
        int number = zero; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                out[number] = nums[i];
                number += 1; 
            }
        }
        return out; 
    

    }

    public static String[] wordsWithout(String[] words, String target) {
        int notTarget = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                notTarget += 1;

            }
        }
        int index = 0;
        String[] out = new String[notTarget];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                out[index] = words[i];
                index += 1; 

            }
        }
        
        return out; 

    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);


            
    }

    public static int scoresAverage(int[] scores) {
        int middle = scores.length / 2;
        int firstAverage = average(scores, 0, middle);
        int secondAverage = average(scores, middle, scores.length);
        if (firstAverage > secondAverage) {
            return firstAverage;
        } else {
            return secondAverage; 
        }
        

    }


    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true; 
    }

    public static int special(int[] scores) {
        int special = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > special && scores[i] % 10 == 0) {
                special = scores[i];
            }
        }
        return special;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int special1 = special(a);
        int special2 = special(b);
        return special1 + special2;

    }

    

    public static String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            String out = "";
            for (int i = str.length(); i < 2; i++) {
                out += "*";
            }
            return str + out;
        }
    }

    public static double divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0.0;
        }
        if (b > a) {
            return (double) b / a;
        } else {
            return (double) a / b;
        }

    }



}
