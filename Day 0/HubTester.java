public class HubTester {
    public static void main(String[] args) {
        testLogin();
        testAt();
        testBlank();
        testEmail();
        testEnsureStudent();
        testExist();
        testStudentEmail();
        testBlankStudentName();
        testBlankStudentPassword();
        testStudentAt();
        testChange();

    }

    public static void testLogin() {
        Hub hub = new Hub();
        hub.registerStudent("Autrin", "111", "autrin@yah.com");
        hub.registerStudent("connor", "222", "connor@yah.com");

        try {
            hub.loginStudent("jake", "000");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because student wasn't registered, as intended");
        }
    }

    public static void testExist() {
        Hub hub = new Hub();
        hub.registerStudent("Autrin", "111", "autrin@yah.com");

        try {
            hub.doesStudentExist("Autrin");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because student already exists, as intended");
        }

    }

    public static void testEnsureStudent() {
        Hub hub = new Hub();
        hub.registerStudent("Connor", "111", "autrin@yah.com");

        try {
            hub.doesStudentExist("Connor");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because student already exists, as intended");
        }

    }

    public static void testAt() {

        try {
            Hub hub = new Hub();
            hub.registerStudent("C@nnor", "111", "autrin@yah.com");
            ;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because there is an @ symbol, as intended");
        }

    }

    public static void testBlank() {

        try {
            Hub hub = new Hub();
            hub.registerStudent(null, "111", "autrin@yah.com");
            ;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because there is an @ symbol, as intended");
        }

    }

    public static void testEmail() {

        try {
            Hub hub = new Hub();
            hub.registerStudent("Connor", "111", "autrincom");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because there is an @ symbol, as intended");
        }

    }

    public static void testStudentAt() {
        try {
            Student student = new Student("C@nnor", "111", "autrin@yah.com");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because there is an @ symbol, as intended");
        }

    }

    public static void testBlankStudentName() {
        try {
            Student student = new Student(null, "111", "autrin@yah.com");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }

        try {
            Student student = new Student("", "111", "autrin@yah.com");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }

    }

    public static void testStudentEmail() {
        try {
            Student student = new Student("Autirn", "111", "autrincom");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }

    }

    public static void testChange() {
        try {
            Student student = new Student("Autrin", "111", "autrin@yah.com");
            student.changeName("@utrin");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }
        try {
            Student student = new Student("Autrin", "111", "autrin@yah.com");
            Student student2 = new Student("Connor", "111", "autrin@yah.com");
            student2.changeName("Autrin");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }

    }

    public static void testBlankStudentPassword() {
        try {
            Student student = new Student("Autrin", null, "autrin@yah.com");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }

        try {
            Student student = new Student("Autrin", "", "autrin@yah.com");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception, as intended");
        }

    }

}
