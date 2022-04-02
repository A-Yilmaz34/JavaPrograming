package LiveReview.week12;

public class StaticMethods {

    public int num = 10;
    public static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message = " + message);
    }

    public void instanceMethod(){
        System.out.println("count = " + count);
    }
}
