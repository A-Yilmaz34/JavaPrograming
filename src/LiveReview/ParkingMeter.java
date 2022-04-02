package LiveReview;

public class ParkingMeter {

    public int timeLeft =0;
    public int maxTime;

    public ParkingMeter(int number){
        maxTime = number;

    }
    public boolean add(int i){
        boolean flag = false;
        if (i==25){
            if (!(timeLeft + 30>maxTime) ){
                timeLeft+=30;
                flag=true;
            }

        }

        return flag;
    }




}
