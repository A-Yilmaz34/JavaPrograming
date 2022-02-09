package day12_Scanner;

import java.util.Scanner;

public class NexLinePractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scan.nextInt();
        System.out.println("Enter your full name");
        scan.nextLine();
        String fullname = scan.nextLine();

        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your school name");
        String school = scan.nextLine();

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        System.out.println("gpa = " + gpa);

        scan.close();





    }
}
