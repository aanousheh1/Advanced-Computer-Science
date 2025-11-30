public class CourseTester {
    public static void main(String[] args) {
        int[] scores1 = {90, 89, 91, 95};
        StudentRecord ana = new StudentRecord("ana", scores1);
        System.out.println(ana.toString());
        System.out.println(ana.toString().equals("Ana's scores: [90, 89, 91, 95] "));
        System.out.println(ana.getAverage(0, 3));
        System.out.println(ana.getTestScore(2));
        System.out.println(ana.hasImproved());
        System.out.println(ana.getFinalAverage());

    }
    
}
