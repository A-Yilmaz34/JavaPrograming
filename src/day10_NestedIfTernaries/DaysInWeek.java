package day10_NestedIfTernaries;

public class DaysInWeek {
    public static void main(String[] args) {
        int n = 5; //1~7
        /*String day;

        if(n==1){
            //System.out.println("Monday");
            day = "Monday";
        }else if(n==2){
            // System.out.println("Tuesday");
            day="Tuesday";
        }else if(n==3){
            // System.out.println("Wednesday");
            day="Wednesday";

        }else if(n==4){
            //System.out.println("Thursday");
            day="Thursday";

        }else if(n==5){
            //System.out.println("Friday");
            day="Friday";

        }else if(n==6){
            //System.out.println("Saturday");
            day="Saturday";

        }else if(n==7){
            //System.out.println("Sunday");
            day="Sunday";

        }else{
            //System.out.println("Invalid");
            day="Invalid";

        }

        System.out.println("day = " + day);*/

        String day = (n==1)?"Monday" :(n==2)?"Tuesday":(n==3)?"Wednesday"
                :(n==4)?"Thurday":(n==5)?"Friday"
                :(n==6)?"Saturday":(n==7)?"Sunday":"not valid";

        System.out.println("day = " + day);



    }
}
