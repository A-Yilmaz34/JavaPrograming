package LiveReview;

public class DivisionAndRemainder {
    public static void main(String[] args) {

        int inputSeconds = 45000;
        int hours,minutes,seconds; //declared


        seconds = inputSeconds % 60; //calculates remaining seconds

        minutes = (inputSeconds/60) % 60; //remaining minutes

        hours = inputSeconds / 3600;

        String clock = ("Hours : "+hours + " Minutes : "+minutes+" Seconds : "+seconds);
        System.out.println("clock = " + clock);









    }
}
