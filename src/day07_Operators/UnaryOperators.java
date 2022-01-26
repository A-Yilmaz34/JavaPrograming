
package day07_Operators;

import java.util.jar.JarOutputStream;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1  + "   " +num2);

int c = 100;
        System.out.println(++c);

int y = 200;
        System.out.println(y--); //after this line increases/decreases
        System.out.println("y = " + y);


        int z = 45;

        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int q = 30;
        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);

    }
}
