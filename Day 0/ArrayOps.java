public class ArrayOps {

    public static String printStringArray(String[] array) {
        String output = "[";
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                output = output + array[i]+ ", ";
            }

        }
        output = output + "]";
        System.out.println(output);

        return output;
    }

    public static String printIntegerArray(int[] array) {
        String output = "[";
        for (int i = 0; i < array.length; i++) {
            output += array[i];
            if (i < array.length - 1) {
                output = output + ", ";
            }

        }
        output = output + "]";
        System.out.println(output);

        return output;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static String findLongestString(String[] array) {
        if (array == null) {
            return null;
        }
        String first = array[0];
        for (int i = 0; i < array.length; i++) {
            String second = array[i];
            if (second != null && second.length() > first.length()) {
                first = second;
            }
        }
        return first;
    }

    public static double averageStringLength(String[] array) {
        if (array == null) {
            return 0.0;
        }
        int sum = 0;
        int numString = 0;
        for (int i = 0; i < array.length; i++) {
            String first = array[i];
            if (first != null) {
                sum += first.length();
                numString += 1;
            }

        }
        if (numString == 0) {
            return 0.0;
        }

        return (double) sum / numString;
    }

    public static int[] countLetterFrequencies(String input) {
        int[] alphabet = new int[26];
        if (input == null) {
            return new int[0];
        }
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                index = letter - 'A';
                alphabet[index]++;
            } else if (letter >= 'a' && letter <= 'z') {
                index = letter - 'a';
                alphabet[index] += 1;
            }
        }
        return alphabet;
    }

    public static int[] removeIntAndScoot(int[] array, int index) {
        if (array == null) {
            return new int[0];
        }
        int[] array2 = new int[array.length];
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                array2[index2] = array[i];
                index2 += 1;

            }

        }
        return array2;
    }

    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] array2 = new int[array.length * 2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array2[index] = array[i];
            index += 1;

        }
        return array2;

    }

    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        }
        String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array2[i] = "#" + i + " " + array[i];
            }
        }
        return array2;

    }

    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] array2 = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            array2[index] = array[i];
            index += 1;
        }
        return array2;
    }

}