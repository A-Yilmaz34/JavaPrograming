package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while(true) {
            System.out.println("enter your age:");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.out.println("Invalid entry please re-enter:");
                age = scan.nextInt();
            }
            System.out.println("would you like to continue?");
            String a = scan.next().toLowerCase();


            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("Invalid entry, would you like to continue?");
                a= scan.next().toLowerCase();
            }
            if(a.equals("no")){
                break;
            }



        }










    }
}
