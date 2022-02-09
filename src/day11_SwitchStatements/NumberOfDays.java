package day11_SwitchStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2001;
        String month ="";

        if(number >= 1 && number<=12){

            switch (number){
                case(2):
                    if (year%4 ==0){
                        month = "29 days";
                    }else{
                        month = "28 days";
                    }
                break;
                case(4): case(6): case(9): case11:
                    month = "30 days";
                    break;
                default:
                    month = "31 days";
            }
        }else{
            System.out.println("Invalid number");
        }
        System.out.println(month);

    }
}
