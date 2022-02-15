package LiveReview;

import java.util.Locale;

public class StringReviews02 {
    public static void main(String[] args) {

        String message = "EU8 is Awesome";

        int count = message.length();
        System.out.println("how many characters we have");
        System.out.println("count==16");
        if(message.length()==16){
            System.out.println("happy testing");
        }System.out.println(message.toUpperCase());

        String str4 = " EU8 Awesome ";
        str4 = str4.trim().replace(" ","").toUpperCase().substring(3);
        System.out.println("str4 = " + str4);





    }
}
