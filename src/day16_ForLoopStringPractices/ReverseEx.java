package day16_ForLoopStringPractices;

import java.util.Scanner;

public class ReverseEx {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();

String result = "";

//str.charAt(str.length()-1);// last character
//result += str.charAt(11); //till 0 we can write the same
        //we can do it with loop

        for (int i = (str.length()-1); i > -1 ; i--) {
            result += str.charAt(i);

        }


        System.out.print(result);







    }
}
