package LiveReview;

public class BasicLoopExamples {
    public static void main(String[] args) {

        /**
         * Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000
         */

        for(int i=0  ;  i<=1000   ;  i+=10 ){
            System.out.print(i+" ");
        }
        System.out.println();
        //==================================
        // initialization
        int z = 0;
        for(  ; z <= 1000 ;  ){
            if(z%10==0) {
                System.out.print(z + " ");
            }
            z++;
            // z+=10;  // iteration
        }

        System.out.println("----------------");
        for (int i = 3; i < 130; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println("-----------------");
int count =0;
        for (int i = 5; i <=50 ; i++) {
            if(i%2==0){
                count++;
            }
        }

        System.out.println("count = " + count);

        System.out.println("-------------");

        int j =1;
        for (; j <=10 ; j++) {
            System.out.println("12 X "+j+" = "+(12*j));
        }



    }
}
