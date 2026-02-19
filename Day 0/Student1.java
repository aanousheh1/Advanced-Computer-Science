public class Student1 {
    private String name;
    private String id;
    private int grade;

    public Student1(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student1(String name) {
        this.name = name;
        grade = 10;
        this.id = generateId();

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id;

    }

    public boolean equals(Student1 other) {
        if (this.name.equals(other.name) && this.grade == other.grade && this.id.equals(other.id)) {
            return true;
        } else {
            return false;
        }
    }

    public String generateId() {
        int a = (int) (Math.random() * 8) + 1;
        int b = (int) (Math.random() * 8) + 1;
        int c = (int) (Math.random() * 8) + 1;
        int d = (int) (Math.random() * 10);
        int e = (int) (Math.random() * 10);
        int f = (int) (Math.random() * 10);
        int g = (int) (Math.random() * 10);
        id = a + "" + b + "" + c + "-" + d + "" + e + "" + f + "" + g;
        return id;
    }

}
