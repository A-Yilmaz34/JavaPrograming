package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String u = scan.next();

        System.out.println("Enter password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i < 4; i++) {
               if(i==3){
                   System.out.println("this is your last chance");
               }

                System.out.println("Incorrect username or password");
                System.out.println("Enter username");
              u = scan.next();

                System.out.println("Enter password");
            p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }
            }

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {

                System.out.println("your account is locked, please contact support team");

            }
        }
    }
}