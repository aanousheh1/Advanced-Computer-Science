public class StudentTester {
    public static void main(String[] args) {
        Student sophomore = new Student("Sandra");
        System.out.println(sophomore.toString());
        Student junior = new Student("Mark", 11);
        System.out.println(junior.toString());
        System.out.println(junior.equals(sophomore));
        Student freshmen = new Student("Sofia", 9);
        System.out.println(freshmen.toString());
        Student senior = new Student("Karl", 12);
        System.out.println(senior.toString());
        System.out.println(freshmen.equals(senior));





    }
}
