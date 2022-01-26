package LiveReview;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        //output goes to consolr----println or print

        String name = "";
        System.out.println("Output");

        //how can ı receive input for my java class?

       // 1. create your scanner object (object name can be anythhing)

        Scanner input = new Scanner(System.in);

        //2. prompt the user for etering the input

        System.out.println("Put your name : ");

        // 3. get the input

        name = input.next(); // reads teh data from console and assign the value to my variable

        // 4. USe the value that ı read
// 1 and 3 step are necessary also we have to import the Scanner

        System.out.println(name);

    }
}
