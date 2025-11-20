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
        return name + "scores: " + scores; 
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

    public double getAverage(int first, int last)
        for (int i = 0; i < )



    

    
}


