package day10_NestedIfTernaries;

public class GradeReport {
    public static void main(String[] args) {

        /*
       90-100 excellent
       :great
       :good
       :passed
       :failed
         */

        int score = 85;
        String result ="";//temporary.


        if(score>= 0 && score<=100){
            //5 possibilities A,B,C,D,F
            if(score>=90){
                result="Excellent";
            }else if(score>=80){
               result="Great";
            }else if(score>=70){
               result="Good";
            }else if(score>=60){
                result="Passed";
            }else{
                result="Failed";
            }
        }else{
            result="Invalid score";
            //if the score is not valid
        }


        System.out.println("result = " + result);




    }
}
