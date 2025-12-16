public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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
        String data = "== " + courseName + " ==\n";
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                break;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                if (enrolledStudents[i].equals(student)) {
                    enrolledStudents[i] = null;
                    return true;
                }
            }
        }
        return false;

    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] larger = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            larger[i] = enrolledStudents[i];
        }
        enrolledStudents = larger;
    }

}
