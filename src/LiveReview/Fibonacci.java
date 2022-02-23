package LiveReview;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
             int   sum;

             String series = ""+n1+" "+n2+" ";
        for (int i = 2; i <= 6; i++) {
            sum = n1+n2;
            n1=n2;
            n2=sum;
            series+= sum+" ";
        }
        System.out.print(series);
        System.out.println("final number in the squence is : "+ n2 );

    }
}
