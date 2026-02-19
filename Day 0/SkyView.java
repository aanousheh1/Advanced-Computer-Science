public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows * numberOfCols < scanned.length) {
            throw new IllegalArgumentException("Can't be small");
        }
        this.view = new double[numberOfRows][numberOfCols];
        int index = 0;
        for (int r = 0; r < view.length; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < view[r].length; c++) {
                    view[r][c] = scanned[index];
                    index++;
                }

            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index];
                    index++;
                }

            }

        }

    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public double[][] getView() {
        return view;
    }

    public String toString() {
        String out = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                out += view[r][c] + " ";

            }
            out += "\n";
        }
        return out;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }
        if (this.view.length != other.view.length) {
            return false;
        }
        for (int r = 0; r < view.length; r++) {
            if (this.view[r].length != other.view[r].length) {
                return false;
            }
            for (int c = 0; c < view[r].length; c++) {
                if (this.view[r][c] != other.view[r][c]) {
                    return false;
                }

            }

        }
        return true;

    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || endRow >= view.length || startRow > endRow
                || startCol < 0 || endCol >= view[0].length || startCol > endCol) {
            throw new IllegalArgumentException("Doesn't work");
        }
        double sum = 0.0;
        int num = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                num++;
            }

        }
        return (double) sum / num;
    }

}
