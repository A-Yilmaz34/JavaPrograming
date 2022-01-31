package LiveReview;

public class Score {
    public static void main(String[] args) {

        // for a given grade assign letter grades:100-90:a, 89-80:B, 79-770:C,69-60:D,below is F

        int score = 95;

        //do sanity check

        if(score >=0 && score<=100){
            System.out.println("Your score is valid");
            if(score<=100 && score>=90){
                System.out.println("A");
            }else if(score<90 && score>=80){
                System.out.println("B");
            }else if(score<80 && score>=70){
                System.out.println("B");
            }else if(score<70 && score>=60){
                System.out.println("B");
            }else{
                System.out.println("F");
            }



        }else{
            System.out.println("Not valid score");
        }









    }
}
