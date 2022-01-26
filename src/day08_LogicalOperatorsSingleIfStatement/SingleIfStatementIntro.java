package day08_LogicalOperatorsSingleIfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 300;
/*
        System.out.println("Odd Number");
        System.out.println("Even Number");
  */
boolean evenNumber = number %2 ==0;
if(evenNumber){

    System.out.println(number +" is even number.");
}
int n = 200;
if(n > 0){

    System.out.println(n+" is positive");
}
if(n<0) {
    System.out.println(n+" is negative");
}
if(n==0){

    System.out.println(n+" is zero");
}



    }
}
