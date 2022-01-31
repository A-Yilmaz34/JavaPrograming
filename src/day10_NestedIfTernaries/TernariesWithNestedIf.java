package day10_NestedIfTernaries;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 835;
        /*if(s>=0 && s<=100){
            if(s>=60){
                System.out.println("passed");
            }else
                System.out.println("failed");
        }else{
        }*/
       String result = (s>=0 && s<=100)? (s>=60)? "passed" :"failed" :"invalid";

        System.out.println("result = " + result);







    }
}
