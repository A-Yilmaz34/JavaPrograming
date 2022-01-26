package day09_IfElseandMultiBranchIfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 200,
                 n2 = 400;

        boolean n1IsMin = n1<n2;
        boolean n2IsMin = n2<n1;
        boolean equal = n1==n2;

        if(n1IsMin){
            System.out.println(n1+ " is the minimum number");
        }
        if(n2IsMin){
            System.out.println(n2+" is the min number");
        }

        if(equal){
            System.out.println("Equal");
        }

      /*  if (n1<n2){
            System.out.println(n1 + " is the minimum number");
        }*/










    }
}
