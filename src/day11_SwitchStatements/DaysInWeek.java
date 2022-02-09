package day11_SwitchStatements;

public class DaysInWeek {
    public static void main(String[] args) {

        int number =9;

        switch (number){//double float long boolean not allowed
                        //1,2,3,4,5,6,7 possible
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }






    }
}
