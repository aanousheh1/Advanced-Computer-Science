import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> answerKey, ArrayList<StudentAnswerSheet> submissions) {
        if (answerKey == null || submissions == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        this.answerKey = answerKey;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        if (submissions == null) {
            throw new IllegalArgumentException("Can't be null");

        }
        if (student == null) {
            throw new IllegalArgumentException("Can't be null");

        }
        submissions.add(student);
    }

    public void gradeTests() {
        if (submissions == null || submissions.size() == 0) {
            throw new IllegalArgumentException("Can't be null");

        }
        if (answerKey == null || answerKey.size() == 0) {
            throw new IllegalArgumentException("Can't be null");

        }
        for (int i = 0; i < submissions.size(); i++) {
            StudentAnswerSheet student = submissions.get(i);
            student.setTestScore(student.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions == null || submissions.size() == 0) {
            return "";

        }
        StudentAnswerSheet high = submissions.get(0);
        double highest = high.getTestScore();
        for (StudentAnswerSheet student : submissions) {
            if (student.getTestScore() > highest) {
                highest = student.getTestScore();
                high = student;
            }

        }
        return high.getName();

    }

}
