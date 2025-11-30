public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String data =  "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            data = data + (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return data;


    }

    public String findBestStudent() {
        int studentNumber = 0;
        double firstAverage = enrolledStudents[0].getFinalAverage();
        for (int i = 1; i < enrolledStudents.length; i++) {
            double secondAverage = enrolledStudents[i].getFinalAverage();
            if (secondAverage > firstAverage) {
                firstAverage = secondAverage;
                studentNumber = i;
            }
        }
        return enrolledStudents[studentNumber].getName();
        
    }


    public double calculateTestAverage(int testNumber) {
        int sum = enrolledStudents[0].getTestScore(testNumber);
        for (int i = 1; i < enrolledStudents.length; i++) {
            sum = sum + enrolledStudents[i].getTestScore(testNumber);
        }
        return (double) sum / enrolledStudents.length;

    }




}





    

