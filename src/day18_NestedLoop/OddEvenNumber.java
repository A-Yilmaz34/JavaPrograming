package day18_NestedLoop;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("enter a number: ");
            int n = scan.nextInt();


            if (n % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){

                System.err.println("Invalid answer please re-enter:");
                a= scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }


        }






    }
}
