package day11_SwitchStatements;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;
        char operator = '+';

        boolean valid = operator =='+' || operator=='-' || operator=='*' || operator=='/';

        if (valid){  //operator: - + * /
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                case '*':
                    System.out.println(n1*n2);
                default:
                    System.out.println(n1/n2);
            }
        }else{
            System.err.println("Invalid Operator:" + operator);
        }







    }
}
