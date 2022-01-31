package day10_NestedIfTernaries;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 85;
        //String result ="";//temporary.

/*
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
        }*/
String result = (score>= 0 && score<=100)? (score>=90)? "Excellent"
        :(score>=80)?"Great" :(score>=70)?"Good"
        :(score>=60)?"Passed" :"Failed" :"Invalid score";

        System.out.println("result = " + result);





    }
}
