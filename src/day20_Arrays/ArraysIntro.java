package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //creating array containing 5 names

        String[] myGroup = new String[5];
        //System.out.println(myGroup); //hashcode
        myGroup[1] = "5";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number =5;
        if (number<1 || number> 7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);






    }
}
