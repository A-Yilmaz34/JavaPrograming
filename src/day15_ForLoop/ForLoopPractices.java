package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        // 15 16 17.......45 print
        for(int i=15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println(); //to make sure the next line starts in the new line

//100 99 98 97 ...50

        for(int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("----------------");

//print all the even nıumbers 1-55

        for (int i=1; i<=55; i++){
            if(i%2 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------");

        //another way:
        for(int i=2; i<=54; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();










    }
}
