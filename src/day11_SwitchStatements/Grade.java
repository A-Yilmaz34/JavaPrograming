package day11_SwitchStatements;

public class Grade {
    public static void main(String[] args) {

        char ch = 'B'; //==
        String result ="";

        switch (ch) {
            case 'A':
                result=("Excellent");
                break;
            case 'B':
                result=("Great");
                break;

            case 'C':
            result=("Good");
                break;


            case 'D':
              result=("Passed");
                break;

            case 'F':
                result=("Failed");
                break;

            default:


        }
        System.out.println(result);

    }
}
