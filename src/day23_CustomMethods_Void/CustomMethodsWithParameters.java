package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scan.nextInt();
        oddOrEven(n);

        ageOfPerson(1991);

        printNumbers(14,98);

    }
// create a function that can check if a number is odd number or even number
public static void oddOrEven (int number){

        if (number % 2 ==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number+" is odd number");
        }

}

public static void ageOfPerson (int birthYear){
    System.out.println("you are "+(2022 - birthYear)+" years old.");

}

    public static void printNumbers(int x,int y){

        for (int i = x+1; i < y; i++) {
            System.out.println(i);
        }
    }







}
