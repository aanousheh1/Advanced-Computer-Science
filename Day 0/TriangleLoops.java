public class TriangleLoops {

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String s = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int x = 0; x < i; x++) {
                s = s + letter;

            }
            s = s + "\n";

        }
        return s;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String s = "";
        for (int i = numberOfRows; i > 0; i--) {
            for (int x = 0; x < i; x++) {
                s = s + letter;
                
            }
            s = s + "\n";
        }
        return s; 
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String s = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int x = 0; x < i; x++) {
                s = s + i;
                
            }
            s = s + "\n";
        }
        return s;
        
        
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        String s = "";
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        for (int i = 0; i <= numberOfRows - 1; i++) {
            for (int x = 0; x < numberOfRows - i - 1; x++) {
                s  = s +  " ";

            }
            for (int k = 0; k < i + 1; k++) {
                char c = (char) ('A' + k);
                s = s + c;

            }

            int rowCount = i;
            for (int j = numberOfRows; j > numberOfRows - i; j--) {
                char c = (char) ('A' + rowCount - 1);
                rowCount--;
                s = s + c;

            }
            
            s = s + "\n";
        }
        return s;

    }

    
}
