public class StudentTester {
    public static void main(String[] args) {
        Student1 sophomore = new Student1("Sandra");
        System.out.println(sophomore.toString());
        Student1 junior = new Student1("Mark", 11);
        System.out.println(junior.toString());
        System.out.println(junior.equals(sophomore));
        Student1 freshmen = new Student1("Sofia", 9);
        System.out.println(freshmen.toString());
        Student1 senior = new Student1("Karl", 12);
        System.out.println(senior.toString());
        System.out.println(freshmen.equals(senior));

    }
}
