public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Your an idiot");
        }
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();

            }
        }
        if (strs.length == 0) {
            return sum / (strs.length + 1);
        } else {
            return sum / (strs.length);
        }
    } // change sum to 0 and delete if-statement and add null handler

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.length() % 2 == 0) {
            reversed = reversed + " ";
        }
        return reversed;
    } // delete if-statement inside for loop and make i >= 0

    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Your an idiot");
        }
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    } // change i value and make it < numbers.length. also add if numbers i is not
      // null excpetion

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Your an idiot");
        }
        int left = 0;
        int right = str.length();
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right - 1);
            if (a != b) {
                return false;
            } else {
                left++;
                right--;

            }
        }
        return true;
    } // make if-else statement, change if statmeent to return false
      // return true end of method. add null handler, and int right = str.length

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Your an idiot");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    } // change to sum+= numbers[i], i < numbers.length, delete else
      // add null handler and delte if statement at the end

    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Your an idiot");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    } // change i = to 0, add null handler

    public static int getNthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Your an idiot");
        }

        if (n == 1) {
            return 0;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    } // make negative excpetion handler, i < n in the for loop,
      // return 0 when n == 1

    public static void sortArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    } // add null handler and change to arr[j] > arr[i]

    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Your an idiot");
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    } // add null handler and change to words[i].length() > longestWord.length()

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("Your an idiot");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    } // add if statment for when one of the variables is negative

    public static int parsePositiveInteger(String str) {

        int number = Integer.parseInt(str);
        if (number >= 0) {
            return number;

        } else {
            throw new NumberFormatException("Your an idiot");
        }

    } // make an if-else statement and throw exceptione

    public static String getArrayElement(String[] arr, int index) {

        return arr[index];

    } // I did a try-catch in my tester

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Your an idiot");
        }

        return Math.sqrt(number);

    } // add exception handler

    public static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    } // add try-catch in tester

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Your an idiot");
        }

        return Math.pow(base, exponent);
    } // add exception handler

}
