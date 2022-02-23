package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();

        System.out.println("enter second number");
        int b = scan.nextInt();

        int count=0;
        while (a>=b){
          a-=b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);




    }
}
