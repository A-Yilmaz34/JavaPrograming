package day08_LogicalOperatorsSingleIfStatement;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;  //0-100 five possible outcomes

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a;
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;

        if (a) {
            System.out.println("excellent");
        }
        if (b) {
            System.out.println("great");
        }
        if (c) {
            System.out.println("good");
        }
        if (d) {
            System.out.println("passed");
        }
        if (f) {
            System.out.println("failed");
        }


    }
}
