package LiveReview;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in); //user input way


        double num1, num2, num3, num4, total; //declaration

        System.out.println("Enter 4 numbers");

      /*  num1=5.5;  hardcoded way
        num2=3.3;
        num3=4.4;
        num4=2.2;*/

        num1= scan.nextDouble();
        num2= scan.nextDouble();
        num3= scan.nextDouble();
        num4= scan.nextDouble();


        total= num1+num2+num3+num4;

        System.out.println("total = "+total);










    }
}
