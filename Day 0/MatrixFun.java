public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
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
        for (int i = 0; i < matrix.length; i++) {
            str += "=";
        }
        return str + "\n" + matrix + "\n" + str;
    }

    public boolean equals(MatrixFun matrix2) {
        if (matrix.toString().equals(matrix2.toString())) {
            return true;
        }
        return false;
    }

    public boolean equals(int[][] matrix3) {
        if (matrix3.length != matrix.length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
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
        for (int r = 0; r < matrix.length; r++) {
            if (r == rowA) {
                matrix[rowA] = matrix[rowB];
                matrix[rowB] = new int[rowA];
            }
        }

    }

}
