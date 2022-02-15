package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        //charAt()
        String word = "Cydeo";
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        char tenthChar = word.charAt(4);
        System.out.println("tenthChar = " + tenthChar);

        //length()
        System.out.println(word.length());

        //last index of variable
        System.out.println(word.charAt(word.length() - 1));

        //toLowerCase() toUpperCase()
        String str = "wooden spoon";
        str.toUpperCase(); //creates another object. doesnt change the original variable
        str = str.toUpperCase(); //changes the variable, changes the variable








    }
}
