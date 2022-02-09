package day11_SwitchStatements;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");

        int num1 = input.nextInt();

        System.out.println("Enter a decimal");

        double num2 = input.nextDouble();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("multipication: "+(num1*num2));

input.close();  //close teh Scanner
    }
}
