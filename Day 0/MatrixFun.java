public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Your an idiot");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int) (Math.random() * 10);
            }
        }

    }

    public MatrixFun(int[][] starterMatrix) {

        this.matrix = starterMatrix;

    }

    public MatrixFun() {
        this(3, 3);

    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        String str = "";
        String mat = "";
        for (int i = 0; i < matrix[0].length * 2 - 1; i++) {
            str += "=";
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                mat += matrix[r][c] + " ";
            }
            mat += "\n";
        }

        return str + "\n" + mat + str;
    }

    public boolean equals(MatrixFun mat) {
        if (matrix.length != mat.matrix.length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            if (mat.matrix[r].length != matrix[r].length) {
                return false;
            }
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] != mat.matrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(int[][] matrix3) {
        if (matrix3.length != matrix.length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            if (matrix3[r].length != matrix[r].length) {
                return false;
            }
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] != matrix3[r][c]) {
                    return false;
                }
            }
        }
        return true;

    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }

    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Your an idiot");
        }
        int[] a = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = a;

    }

}
