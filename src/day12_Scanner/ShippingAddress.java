package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Full name");
        String name = scan.nextLine();

        System.out.println("Enter your bulding number");
        String building = scan.next();
        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zipcode");
        String zip = scan.next();
        scan.nextLine();
        System.out.println("Enter your country");
        String country = scan.nextLine();

        System.out.println("name = " + name);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("zip = " + zip);
        System.out.println("state = " + state);
        System.out.println("city = " + city);
        System.out.println("country = " + country);
    }
}
