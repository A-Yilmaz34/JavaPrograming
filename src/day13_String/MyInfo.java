package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your gender:");
        String gender = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name:");
        String name = scan.nextLine();

        System.out.println("Enter your phone number:");
        double phone = scan.nextDouble();

        System.out.println("Enter your zip:");
        int zip = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school:");
        String school = scan.nextLine();

        System.out.println("Enter your city:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        scan.nextLine();
        System.out.println("Enter your bulding:");
        String building = scan.nextLine();

        System.out.println("Enter your street:");
        String street = scan.next();
        scan.close();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("zip = " + zip);
        System.out.println("school = " + school);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("building = " + building);
        System.out.println("street = " + street);


    }
}
