import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - (n - i)]) {
                return false;
            }

        }

        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 0; (i + 2) < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                if (nums[i + 1] - nums[i] == 2 && nums[i + 2] - nums[i + 1] == 2) {
                    return true;
                }
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                if (nums[i + 1] - nums[i] == 2 && nums[i + 2] - nums[i + 1] == 2) {
                    return true;
                }
            }
        }

        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] numbers = new int[end - start];
        for (int i = 0; i < (end - start); i++) {
            numbers[i] = start + i;
        }

        return numbers;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String[] numbers = new String[end - start];
        for (int i = 0; i < (end - start); i++) {
            if ((start + i) % 3 != 0 && (start + i) % 5 != 0) {
                numbers[i] = String.valueOf(start + i);
            }
            if ((start + i) % 3 == 0 && (start + i) % 5 != 0) {
                numbers[i] = "Fizz";
            }
            if ((start + i) % 3 != 0 && (start + i) % 5 == 0) {
                numbers[i] = "Buzz";
            }
            if ((start + i) % 3 == 0 && (start + i) % 5 == 0) {
                numbers[i] = "FizzBuzz";
            }

        }

        return numbers;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] num2 = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                num2[index] = nums[i];
                index = index + 1;

            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                num2[index] = nums[i];
                index = index + 1;

            }
        }

        return num2;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                nums2.set(index, nums.get(i));
            }
            index++;

        }

        return nums2;

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 13 || nums.get(i) > 19) {
                nums2.set(index, nums.get(i));
            }
            index++;

        }

        return nums2;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        ArrayList<String> str2 = new ArrayList<String>();
        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i) + "y";
            if (!s.contains("yy")) {
                str2.add(s);
            }

        }

        return str2;
    }

    // Method 4: squarePlus
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        if (nums.size() <= 0) {
            throw new IllegalArgumentException("Can't be empty");
        }
        // to-do: implement the method
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i);
            if (((value * value) + 10) % 10 != 5 || ((value * value) + 10) % 10 != 6) {
                nums2.add((value * value) + 10);
            }
        }

        return nums2;
    }

}