package LiveReview;

import java.util.Arrays;
import java.util.Scanner;

public class EmailExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid email");
        String email = scan.next();

        int indexof_ = email.indexOf("_");
        int indexOfDot = email.indexOf(".");
        int indexOfAtSign = email.indexOf("@");

        String firstName = email.substring(0, indexof_);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String lasyName = email.substring(indexof_+1,indexOfAtSign);
        lasyName = lasyName.substring(0,1).toUpperCase()+lasyName.substring(1).toLowerCase();
        System.out.println("lasyName = " + lasyName);









    }
}
