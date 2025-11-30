public class StudentRecord {
    private String name;
    private int[] scores; 

    public StudentRecord(String name, int[] scores) {
        this.name = name; 
        this.scores = scores;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String toString() {
        String out = name + "'s scores: [";
        for (int i = 0; i < scores.length; i++) {
            out += scores[i];
            if (i < scores.length - 1) {
                out = out + ", ";
            }
        
        }
        out = out + "]"; 
        return out; 
    }

    public boolean equals(StudentRecord other) {

        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != other.scores[i]) {
                return false; 
            }
        }
        if (!this.name.equals(other.name)) {
            return false;
        }

        return true; 


    }

    public double getAverage(int first, int last) {
        int sum = 0; 
        for (int i = first; i <= last; i++) {
            sum = sum + scores[i];

        }

        int numValues = (last - first) + 1;
        return (double) sum / numValues;


    }

    public int getTestScore(int testNumber) {
        if (testNumber >= scores.length || testNumber < 0) {
            return -1; 
        } else {
            return scores[testNumber];
        }
    }

    public boolean hasImproved() {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public double getFinalAverage() {
        if (hasImproved() == true) {
            return getAverage(scores.length / 2, scores.length - 1);
        } else {
            return getAverage(0, scores.length - 1);
        }

    }






    

    
}


