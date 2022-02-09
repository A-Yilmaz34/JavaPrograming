package day11_SwitchStatements;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'm';
        String result = "";

        switch (ch){

            case 'A': case 'B': case 'C': case 'D':
                result = ("Passed");
                break;
            default:
                result = "Failed";
        }System.out.println(result);






    }
}
