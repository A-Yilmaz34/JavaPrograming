package day24_CustomMethodsReturn;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();
        String result= "";
        //WRITE YOUR CODE HERE

            result= (age==18 && age==17)?"scholar" :(age==16 || age>=14)? "high school"
                    :(age==13)? "impossible":(age==12 || age==11)? "middle"
                    :(age<=10 || age>=8)? "elementary":(age==7 || age==6)? "young reader"
                    :(age<=5 || age>=3)? "early childhood":(age==2)? "toddler"
                    :"ineligible";
            System.out.println(result);





    }
}
