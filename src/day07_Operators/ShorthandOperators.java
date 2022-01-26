package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {


        //assignment: =

        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number);// 200

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "wooden spoon";

        System.out.println("word = " + word);

        System.out.println("----------------------------");

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); //300
        //shortcut : x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 500$
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

//withdraw 200 then deposit 400

        availableBalance -= 200;
        availableBalance += 400;

        System.out.println("availableBalance = " + availableBalance);

        double doge = 0.00000001;
        doge *= 10000000;

        System.out.println("doge = " + doge);

        double num2 = 25000.0;

        num2 /= 2;

        System.out.println("num2 = " + num2);

        double num3 = 100;
        num3 %= 3;

        System.out.println("num3 = " + num3);


        int amount = 127;
        int quarter = amount / 25;
        int cents = amount % 25;

        System.out.println("quarter = " + quarter);
        System.out.println("cents = " + cents);

        int y = 300;
        y %= 16;

        System.out.println("y = " + y);


    }
}
