package day09_IfElseandMultiBranchIfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 33, //ALL OF TEHM ARE 3 DIFFERENT NUMBERS
         b = 34,
         c = 35;

        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println("a is the median number");
        }

        if(bIsMedian){
            System.out.println("b is the median number");
        }

        if(cIsMedian){
            System.out.println("c is the median number");
        }






    }
}
