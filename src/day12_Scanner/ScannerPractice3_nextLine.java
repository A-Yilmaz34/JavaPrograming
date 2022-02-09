package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullname = scan.nextLine();

        System.out.println("enter your school");
        String sname = scan.nextLine();

        System.out.println("Enter your programming language");
        System.out.println("fullname = " + fullname);

        scan.close();


    }
}
