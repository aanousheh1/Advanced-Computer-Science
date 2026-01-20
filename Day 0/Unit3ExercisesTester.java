public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testCalculateStringLengthAverage2();
        testCalculateStringLengthAverage3();
        testReverse();
        testReverse2();
        testReverse3();
        testReverse4();
        testMax();
        testMax2();
        testMax3();
        testMax4();
        testPalindrome();
        testPalindrome2();
        testPalindrome3();
        testPalindrome4();
        testEven();
        testEven2();
        testEven3();
        testEven4();
        testSquares();
        testSquares2();
        testFib();
        testFib2();
        testArray();
        testArray2();
        testArray3();
        testLong();
        testLong2();
        testLong3();
        testInterest();
        testInterest2();
        testInterest3();
        testInterest4();
        testParse();
        testElement();
        testRoot();
        testSum();
        testPower();

    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

    }

    public static void testCalculateStringLengthAverage2() {
        // Test Case - Edge Case: Null element rray
        String[] letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

    }

    public static void testCalculateStringLengthAverage3() {
        // Test Case - Edge CAse: Null array
        try {
            String[] letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverse() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

    }

    public static void testReverse2() {
        // Test Case - Edge Case: String with spaces at the end and in the middle
        String testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

    }

    public static void testReverse3() {
        // Test Case - Edge Case: String with special characters
        String testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

    }

    public static void testReverse4() {
        // Test Case - Edge Case: Null string
        try {
            String testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

    }

    public static void testMax() {
        int[] numbers = { 1, 4, 5, 2, 3 };
        System.out.println("Expected: 5 " + Unit3Exercises.findMaxValue(numbers));

    }

    public static void testMax2() {
        int[] numbers = { -1, 0, 6, -2, 3 };
        System.out.println("Expected: 6 " + Unit3Exercises.findMaxValue(numbers));

    }

    public static void testMax3() {
        int[] numbers = { -1, -4, -5, -2, -7 };
        System.out.println("Expected: -1 " + Unit3Exercises.findMaxValue(numbers));

    }

    public static void testMax4() {
        try {
            int[] numbers = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void testPalindrome() {
        String str = "racecar";
        System.out.println(Unit3Exercises.isPalindrome(str));

    }

    public static void testPalindrome2() {
        String str = "hello";
        System.out.println(Unit3Exercises.isPalindrome(str));

    }

    public static void testPalindrome3() {
        try {
            String str = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(str));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

    }

    public static void testPalindrome4() {
        String str = "";
        System.out.println(Unit3Exercises.isPalindrome(str));

    }

    public static void testEven() {
        int[] numbers = { 1, 4, 5, 2, 3 };
        System.out.println("Expected: 6 " + Unit3Exercises.sumEvenNumbers(numbers));

    }

    public static void testEven2() {
        int[] numbers = { -1, -4, -5, -2, -3 };
        System.out.println("Expected: -6 " + Unit3Exercises.sumEvenNumbers(numbers));

    }

    public static void testEven3() {
        int[] numbers = { 1, -4, 5, 2, -3 };
        System.out.println("Expected: -2" + Unit3Exercises.sumEvenNumbers(numbers));

    }

    public static void testEven4() {
        try {
            int[] numbers = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void testSquares() {
        int[] numbers = { 1, 2, 3, 4 };
        System.out.println("Expected: 30 " + Unit3Exercises.calculateSumOfSquares(numbers));

    }

    public static void testSquares2() {
        try {
            int[] numbers = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void testFib() {
        int n = 6;
        System.out.println("Expected: 5 " + Unit3Exercises.getNthFibonacci(n));

    }

    public static void testFib2() {
        try {
            int n = -3;
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(n));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the int was negative, as intended");
        }

    }

    public static void testArray() {
        int[] arr = { 4, 1, 3, 2, 6, 5 };
        Unit3Exercises.sortArrayDescending(arr);
    }

    public static void testArray2() {
        int[] arr = { -4, -1, -3, -2, -6, -5 };
        Unit3Exercises.sortArrayDescending(arr);
    }

    public static void testArray3() {
        try {
            int[] arr = null;
            Unit3Exercises.sortArrayDescending(arr);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array as null, as intended");
        }
    }

    public static void testLong() {
        String sentence = "I love oranges green";
        System.out.println("Expected: oranges " + Unit3Exercises.findLongestWord(sentence));
    }

    public static void testLong2() {
        String sentence = "I love eating an orange";
        System.out.println("Expected: eating " + Unit3Exercises.findLongestWord(sentence));
    }

    public static void testLong3() {
        try {
            String sentence = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the sentence was null, as intended");
        }
    }

    public static void testInterest() {
        double principal = 500;
        double rate = 3.5;
        int years = 4;
        System.out.println("Expected: " + Unit3Exercises.calculateInterest(principal, rate, years));

    }

    public static void testInterest2() {
        try {
            double principal = -500;
            double rate = 3.5;
            int years = 4;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the value was negative, as intended");
        }
    }

    public static void testInterest3() {
        try {
            double principal = 500;
            double rate = -3.5;
            int years = 4;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the value was negative, as intended");
        }
    }

    public static void testInterest4() {
        try {
            double principal = 500;
            double rate = 3.5;
            int years = -4;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the value was negative, as intended");
        }
    }

    public static void testParse() {
        try {
            String str = "-5";
            System.out.println("Expected exception: " + Unit3Exercises.parsePositiveInteger(str));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the value was negative, as intended");
        }

    }

    public static void testElement() {
        try {
            String[] arr = { "1, 2, 3, 4, 5, 6" };
            int index = 10;
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(arr, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the index was not a possible value, as intended");
        }

    }

    public static void testRoot() {
        try {
            int number = -4;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSquareRoot(number));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Cannot calculate square root of negative number. Double.NaN");
        }

    }

    public static void testSum() {
        try {
            int[] array = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumArrayElements(array));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array as null, as intended");
        }

    }

    public static void testPower() {
        try {
            int base = 2;
            int exponent = -2;
            System.out.println("Expected exception: " + Unit3Exercises.calculatePower(base, exponent));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the exponent was negative, as intended");
        }

    }

}
