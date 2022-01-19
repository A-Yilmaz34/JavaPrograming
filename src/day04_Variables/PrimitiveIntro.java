package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {

//age : 38 years old
        byte age = 38;

        short weight = 160; //160 is within the range of short
        int salary = 100_000;
        long num = 3_333_333_333L;
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 21000;
        System.out.println("ch3 = " + ch3);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);


        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

    }


}
